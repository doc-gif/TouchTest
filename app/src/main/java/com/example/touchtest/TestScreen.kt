package com.example.touchtest

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MotionEventCompat.getActionMasked
import com.example.touchtest.databinding.ActivityTestScreenBinding
import com.google.android.material.snackbar.Snackbar
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import org.apache.commons.csv.CSVFormat
import java.io.BufferedReader
import java.io.InputStreamReader

class TestScreen : AppCompatActivity() {
    private lateinit var binding: ActivityTestScreenBinding
    private lateinit var realm: Realm
    private var fragID = 1
    private var csvID = 0
    private var csv = ""
    private var numQue = 0
    private var maxNumQue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        realm = Realm.getDefaultInstance()

        val result = realm.where<Setting>().findFirst()!!
        csvID = result.csvID
        numQue = result.numQue

        createData()

        if (numQue == 99) {
            numQue = maxNumQue
            val target = realm.where<Setting>().findFirst()!!
            target.numQue = numQue
        }

        if (numQue > maxNumQue) {
            Snackbar.make(
                binding.snackbar,
                "出題数が${numQue}問より少ないので${maxNumQue}問出題します。",
                Snackbar.LENGTH_SHORT).show()
            numQue = maxNumQue
            val target = realm.where<Setting>().findFirst()!!
            target.numQue = numQue
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return when (getActionMasked(event)) {
            MotionEvent.ACTION_DOWN -> {
                if (
                    realm.where<Setting>().findFirst()!!.current
                    == realm.where<Setting>().findFirst()!!.numQue
                ) {
                    val intent = Intent(this, Result::class.java)
                    startActivity(intent)
                }
                fragID = if (fragID == 0) 1 else 0
                val fragment =
                    if (fragID == 0) Commentary() else Test()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.addToBackStack(null)
                transaction.replace(
                    R.id.fragmentContainerView,
                    fragment
                )
                transaction.commit()
                true
            }
            else -> super.onTouchEvent(event)
        }
    }

    override fun onBackPressed() { }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    private fun createData() {
        csv = when (csvID) {
            0 -> "HowToWrite.csv"
            1 -> "ChineseCharacter.csv"
            2 -> "originalWords.csv"
            3 -> "ancientWords.csv"
            else -> ""
        }
        val reader = BufferedReader(InputStreamReader(resources.assets.open(csv)))
        reader.use {
            val records = CSVFormat.EXCEL.parse(reader)
            realm.beginTransaction()
            val target = realm.where<AlphaData>().findAll()
            target.deleteAllFromRealm()
            records.records.forEach { record ->
                val obj = realm.createObject<AlphaData>()
                val numList = realm.createObject<NumList>()
                numList.id = record[0].toInt()
                obj.id = record[0].toInt()
                obj.que = record[1]
                obj.com1 = record[2]
                obj.com2 = record[3]
                obj.com3 = record[4]
                obj.com4 = record[5]
            }
        }
        maxNumQue = realm.where<AlphaData>().findAll().size
    }
}