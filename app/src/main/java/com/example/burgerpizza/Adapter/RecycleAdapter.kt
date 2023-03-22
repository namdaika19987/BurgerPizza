package com.example.burgerpizza.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.burgerpizza.Fragment.HomeFragment
import com.example.burgerpizza.Interface.ItemList
import com.example.burgerpizza.Model.User
import com.example.burgerpizza.R


class RecycleAdapter(val users: List<User>, val context: HomeFragment, itemList: ItemList,
val onCLICK:(User) -> Unit): RecyclerView.Adapter<RecycleAdapter.MyHolder>() {

    private val mlistener = itemList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemList = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)
        return MyHolder(itemList)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val currentItem = users[position]
        holder.number.text = currentItem.number
        holder.name.text = currentItem.name
        holder.tittle.text = currentItem.tittle
        holder.price.text = currentItem.price
        holder.imageID.setImageResource(currentItem.imageID)

        holder.itemView.setOnClickListener {
            onCLICK
        }


    }

    override fun getItemCount(): Int {
        return users.size
    }

    inner class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val number: TextView = itemView.findViewById(R.id.textView)
        val name: TextView = itemView.findViewById(R.id.textView3)
        val tittle: TextView = itemView.findViewById(R.id.textView2)
        val price: TextView = itemView.findViewById(R.id.textView4)
        val imageID: ImageView = itemView.findViewById(R.id.imageView)


    }
}