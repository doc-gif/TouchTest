package com.example.touchtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: Array<ResultData>):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private lateinit var listener: OnClickListener

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val id: TextView = view.findViewById(R.id.id_res)
        val question: TextView = view.findViewById(R.id.question_res)
        val com1: TextView = view.findViewById(R.id.com1_res)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text = dataSet[position].id.toString()
        holder.question.text = dataSet[position].question
        holder.com1.text = dataSet[position].com1
        holder.itemView.setOnClickListener {
            listener.onItemClick(dataSet[position])
        }
    }

    override fun getItemCount() = dataSet.size

    interface OnClickListener {
        fun onItemClick(data: ResultData)
    }

    fun setOnCellClickListener(listener: OnClickListener) {
        this.listener = listener
    }
}