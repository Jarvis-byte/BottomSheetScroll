package com.example.bottomsheetfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class YourRecyclerViewAdapter : RecyclerView.Adapter<YourRecyclerViewAdapter.ViewHolder>() {

    private val dataList = listOf("Item 1", "Item 2", "Item 3", "Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4","Item 4")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(item: String) {
            textView.text = item
        }
    }
}