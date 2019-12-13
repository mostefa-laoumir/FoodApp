package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var foodList = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //load food
        foodList.add(Food("Coffe",R.drawable.coffee_pot,"Coffee is a huge source of cafeine."))
        foodList.add(Food("Espresso",R.drawable.espresso,"This one is made by a special machine."))
        foodList.add(Food("French Fries",R.drawable.french_fries,"Fried Potato fingers, ofcourse its french, right mahfoudha?"))
        foodList.add(Food("Honey",R.drawable.honey,"It's basically bee's SHIT, you're welcome"))
        foodList.add(Food("Strawberry Ice Cream",R.drawable.strawberry_ice_cream,"Its not even real srawberries but we never tell you!"))
        foodList.add(Food("Sugar Cubes",R.drawable.sugar_cubes,"Just a shaped sugar so we can charge you more!"))
    }
}
