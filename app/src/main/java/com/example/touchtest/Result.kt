package com.example.touchtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.touchtest.databinding.ActivityResultBinding
import io.realm.Realm
import io.realm.kotlin.where

class Result : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    private lateinit var realm: Realm
    private lateinit var mAdapter: CustomAdapter
    private var mDataList: Array<ResultData> = arrayOf()
    private var dataList: MutableList<ResultData> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        realm = Realm.getDefaultInstance()

        val dataNum = realm.where<AnsweredNumList>().findAll()
        for (i in 0 until dataNum.size) {
            val data = realm.where<AlphaData>().equalTo("id", dataNum[i]!!.id).findFirst()!!
            dataList.add(ResultData(data.id, data.que, data.com1))
        }

        mDataList = dataList.toTypedArray()
        val recyclerView = binding.recyclerview
        mAdapter = CustomAdapter(mDataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mAdapter

        mAdapter.setOnCellClickListener(
            object:CustomAdapter.OnClickListener {
                override fun onItemClick(data: ResultData) {
                    val intent = Intent(this@Result, ResultShow::class.java)
                    intent.putExtra("ID", data.id)
                    startActivity(intent)
                }
            }
        )

        binding.tohome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}