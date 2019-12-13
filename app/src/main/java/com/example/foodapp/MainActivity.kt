package com.example.foodapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.food_ticket.view.*

class MainActivity : AppCompatActivity() {
    var adapter:FoodAdapter? = null
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
        adapter = FoodAdapter(this,foodList)
    }
    class FoodAdapter: BaseAdapter{
        var food = ArrayList<Food>()
        var context: Context?=null


        constructor(context: Context,food:ArrayList<Food>):super(){
            this.food=food
            this.context=context
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var foodinst = this.food[position]
            var inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodView = inflater.inflate(R.layout.food_ticket,null)
            foodView.ivFood.setImageResource(foodinst.image!!)
            foodView.tvName.text = foodinst.name

        return foodView
        }

        override fun getItem(position: Int): Any {
            return food[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return food.size
        }

    }

}
