package com.example.recyclerviewexam7_reversestack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexam1.FoodAdapter
import com.example.recyclerviewexam1.FoodModle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var datalist = mutableListOf<FoodModle>(FoodModle("김치찌개","1")
            ,FoodModle("된장찌개","2"),FoodModle("고추장김치찌개","3"),
            FoodModle("두부찌개","4"),FoodModle("감자찌개","5"))
    var namelist = mutableListOf<String>("김기연","사미자","오미자","강부자","진소라")
    var numberlist = mutableListOf<String>("003","004","005","006","007")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adpter = FoodAdapter(datalist)
        recyclerView.adapter= adpter
        val manager = LinearLayoutManager(this)
        manager.reverseLayout  = true
        manager.stackFromEnd = true
        recyclerView.layoutManager = manager


        button.setOnClickListener{
            val name = namelist.random()
            val number = numberlist.random()
            Log.d("main","${name},${number}")
            datalist.add(FoodModle(name, number))
            adpter.notifyDataSetChanged()
        }
    }
}
