package com.f_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.f_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val foodList= arrayListOf("Chines","Sadza","Pizza","KFC")
        binding.getFoodBut.setOnClickListener{
            val random = Random
            val randomFood=random.nextInt(foodList.count())
            binding.selfoodTxt.text=foodList[randomFood]
        }
        binding.clearBt.setOnClickListener{
            binding.addFoodTx.text!!.clear()
        }
        binding.addFoodBt.setOnClickListener{
            val newFood=binding.addFoodTx.text.toString()
            foodList.add(newFood)
            binding.addFoodTx.text!!.clear()
        }
        }
}