package com.example.tablayouttask
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.foods.view.*

class FirstAdapter(val foodlist: ArrayList<Food>): RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    override fun getItemCount(): Int {
        return foodlist.size
    }
    override fun onCreateViewHolder(viewgroup: ViewGroup, viewType: Int): FirstViewHolder {
        val layoutinflater= LayoutInflater.from(viewgroup.context )
        val  ovqats = layoutinflater.inflate(R.layout.foods,viewgroup,false)
        return FirstViewHolder(ovqats)
    }
    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        val food = this.foodlist[position]

        holder?.view?.imgFood.setImageResource(food.image!!)
        holder?.view?.tvName.text=food.name
             }

    inner class FirstViewHolder(val view: View): RecyclerView.ViewHolder(view)
    {



        init {


            view.setOnClickListener {
                val intent = Intent(view.context, FoodDescription::class.java)
            intent.putExtra("name", foodlist[adapterPosition])

                view.context.startActivity(intent)
            }
        }

    }
}
