package com.example.recyclerviewexam1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexam7_reversestack.R
import kotlinx.android.synthetic.main.item_view.view.*


class FoodAdapter (val list:List<FoodModle>) : RecyclerView.Adapter<FoodDataViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodDataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false )
        return FoodDataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: FoodDataViewHolder, position: Int) {
        list[position].run{
            holder.containerView.name.text = name
            holder.containerView.price.text = price+ "원"
        }
    }
}