package com.example.daftarmakanankekiniansurabaya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_food.view.*

class AdapterFood (val itemFoodList: List<DataFood>, val clickListener: (DataFood) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_food, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFoodList[position], clickListener)
    }
    override fun getItemCount() = itemFoodList.size
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data : DataFood, clickListener: (DataFood) -> Unit){
            itemView.imgFood.setImageResource(data.imageFud)
            itemView.list_food.text = data.nameFud
            itemView.list_harga.text = data.listHarga
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}