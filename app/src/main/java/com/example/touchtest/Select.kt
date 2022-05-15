package com.example.touchtest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.touchtest.databinding.ActivitySelectBinding
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where

class Select : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var binding: ActivitySelectBinding
    private lateinit var realm: Realm
    private var csvID = 0
    private var numQue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)
        realm = Realm.getDefaultInstance()

        initSpinner()

        binding.next.setOnClickListener { next() }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
        csvID = pos
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        csvID = 0
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    private fun initSpinner() {
        val spinner = binding.selectCsv
        ArrayAdapter.createFromResource(
            this,
            R.array.kind_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = this
        }
    }

    private fun getRadioButtonIndex() {
        numQue = when (binding.radioGroup.checkedRadioButtonId) {
            binding.ten.id -> 10
            binding.twenty.id -> 20
            binding.thirty.id -> 30
            binding.forty.id -> 40
            binding.fifty.id -> 50
            binding.hundred.id -> 100
            binding.all.id -> 99
            else -> 0
        }
    }

    private fun checkError(): Boolean {
        return numQue == 0
    }

    private fun registerSetting() {
        realm.executeTransaction {
            realm.where<Setting>().findAll().deleteAllFromRealm()
            val obj = realm.createObject<Setting>()
            obj.csvID = csvID
            obj.numQue = numQue
            obj.num = 0
            obj.current = 0
        }
    }

    private fun next() {
        getRadioButtonIndex()
        if (checkError()) return
        registerSetting()
        val intent = Intent(this, TestScreen::class.java)
        startActivity(intent)
    }
}