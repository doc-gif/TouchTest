package com.example.touchtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.touchtest.databinding.FragmentTestBinding
import io.realm.Realm
import io.realm.kotlin.where

class Test : Fragment() {
    private lateinit var realm: Realm
    private var _binding: FragmentTestBinding? = null
    private val binding get() = _binding!!
    private var numList: MutableList<Int> = mutableListOf()
    private var num = 0
    private var current = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        realm = Realm.getDefaultInstance()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val set1 = realm.where<Setting>().findFirst()!!
        current = set1.current + 1
        set1.current = current

        for (i in 0 until realm.where<NumList>().findAll().size) {
            numList.add(realm.where<NumList>().findAll()[i]!!.id)
        }
        num = numList[(0 until numList.size).random()]
        binding.question.text = realm.where<AlphaData>().equalTo("id", num).findFirst()!!.que
        val set = realm.where<Setting>().findFirst()!!
        set.num = num
        binding.current.text = current.toString()
        binding.total.text = set.numQue.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}