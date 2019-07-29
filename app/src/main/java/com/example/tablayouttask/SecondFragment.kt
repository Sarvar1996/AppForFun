package com.example.tablayouttask

import android.app.AlertDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_context.view.*
import kotlinx.android.synthetic.main.recycleview_layout.*

class SecondFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.recycleview_layout,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var foodlist = ArrayList<Food>()
        foodlist.add(Food("Coffee", R.drawable.cola,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodlist.add(Food("Espersso", R.drawable.beer,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodlist.add(Food("French Fires", R.drawable.cola,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodlist.add(Food("Honey",R.drawable.beer,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodlist.add(Food("Coffee", R.drawable.cola,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodlist.add(Food("Espersso", R.drawable.beer,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodlist.add(Food("French Fires", R.drawable.cola,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodlist.add(Food("Honey",R.drawable.beer,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))

        val a = FirstAdapter(foodlist)

        val fab: View = view.findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            val mDialogView = LayoutInflater.from(context).inflate(R.layout.add_context,null)
            val mBuilder = AlertDialog.Builder(context)
                .setView(mDialogView)
                .setTitle("Add New Product")
            val mAlertDialog = mBuilder.show()
            mDialogView.submitbtn.setOnClickListener{
                mAlertDialog.dismiss()
                val name = mDialogView.NewdescriptET.text.toString()
                val description = mDialogView.NewdescriptET.text.toString()
                a.foodlist.add(Food(name,R.drawable.fries, description=description))
                a.notifyDataSetChanged()
            }
        }


        recycle.layoutManager= GridLayoutManager(context,2)
        recycle.adapter= a
    }
}