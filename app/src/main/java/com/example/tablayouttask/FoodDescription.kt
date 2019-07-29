package com.example.tablayouttask


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.foods.*
import kotlinx.android.synthetic.main.item_details.*
import kotlinx.android.synthetic.main.item_details.tvName

class FoodDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_details)

        val bundle = intent.extras
        val people= getIntent().getSerializableExtra("name") as Food
        tvName.text = people.name
        tvDetails.text = people.description
        people.image?.let { imgFoodDetails.setImageResource(it) }

    }
}
