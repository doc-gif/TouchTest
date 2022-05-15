package com.example.touchtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.touchtest.databinding.FragmentCommentaryBinding
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where

class Commentary : Fragment() {
    private lateinit var realm: Realm
    private var _binding: FragmentCommentaryBinding? = null
    private val binding get() = _binding!!
    private var numList: MutableList<Int> = mutableListOf()
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        realm = Realm.getDefaultInstance()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCommentaryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val set = realm.where<Setting>().findFirst()!!
        num = set.num
        binding.currentCom.text = set.current.toString()
        binding.totalCom.text = set.numQue.toString()
        val data = realm.where<AlphaData>().equalTo("id", num).findFirst()!!
        binding.questionCom.text = data.que
        binding.com1.text = data.com1
        binding.com2.text = data.com2
        binding.com3.text = data.com3
        binding.com4.text = data.com4
        for (i in 0 until realm.where<NumList>().findAll().size) {
            numList.add(realm.where<NumList>().findAll()[i]!!.id)
        }
        numList.remove(num)
        val obj = realm.createObject<AnsweredNumList>()
        obj.id = num
        realm.where<NumList>().findAll().deleteAllFromRealm()
        for (i in 0 until numList.size)
            realm.createObject<NumList>().id = numList[i]
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}