package com.example.touchtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.touchtest.databinding.ActivityResultShowBinding
import io.realm.Realm
import io.realm.kotlin.where

class ResultShow : AppCompatActivity() {
    private lateinit var binding: ActivityResultShowBinding
    private lateinit var realm: Realm
    private var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        realm = Realm.getDefaultInstance()

        id = intent.getIntExtra("ID", 0)
        val data = realm.where<AlphaData>()
            .equalTo("id", id)
            .findFirst()!!

        binding.questionReshow.text = data.que
        binding.com1Reshow.text = data.com1
        binding.com2Reshow.text = data.com2
        binding.com3Reshow.text = data.com3
        binding.com4Reshow.text = data.com4
        binding.backbutton.setOnClickListener {
            this.finish()
        }
    }
}
