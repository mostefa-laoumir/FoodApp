package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        val budnle = intent.extras
        ivImage.setImageResource(budnle!!.getInt("image"))
        tvName.text = budnle.getString("name")
        tvDes.text = budnle.getString("des")

    }
}
