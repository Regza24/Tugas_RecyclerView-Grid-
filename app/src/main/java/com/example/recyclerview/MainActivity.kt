package com.example.recyclerview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()
{   val CarList: ArrayList<CarModel> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?)
    {   super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CarList.add(
            CarModel
            (   "Lamborghini",
                BitmapFactory.decodeResource
                (   resources, R.drawable.icon1
                )
            )
        )
        CarList.add(
            CarModel
            (   "Porsche",
                BitmapFactory.decodeResource
                (   resources, R.drawable.icon2
                )
            )
        )
        CarList.add(
            CarModel
            (   "Ferrari",
            BitmapFactory.decodeResource
                (   resources, R.drawable.icon3
                )
            )
        )
        layoutManager = LinearLayoutManager(this)
        rvCarList.layoutManager = layoutManager
        rvCarList.adapter = RecyclerViewAdapter(this, CarList)
    }
}