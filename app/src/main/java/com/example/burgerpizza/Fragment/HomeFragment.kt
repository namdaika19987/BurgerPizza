package com.example.burgerpizza.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.burgerpizza.Adapter.RecycleAdapter
import com.example.burgerpizza.Interface.ItemList
import com.example.burgerpizza.Model.User
import com.example.burgerpizza.R
import com.example.burgerpizza.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    //private lateinit var drawerLayout: DrawerLayout
    private var binding : FragmentHomeBinding? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var list: ArrayList<User>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list = arrayListOf<User>()
        list.add(User("8.3","Chicken Burger","100gr chicken + totato + cheese", "$20.00", R.drawable.burger_1))
        list.add(User("8.3","Grilled Meat Burger","100gr chicken + totato + cheese", "$30.00", R.drawable.burger_1))
        list.add(User("8.3","Cheese Burger","100gr chicken + totato + cheese", "$20.00", R.drawable.burger_1))
        list.add(User("8.3","Sausage Burger","100gr chicken + totato + cheese", "$15.00", R.drawable.burger_1))

        recyclerView= view.findViewById(R.id.menu)
        val lm = LinearLayoutManager(context)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager = lm
        recyclerView.setHasFixedSize(true)

        val adapter = RecycleAdapter(list, this, object : ItemList {

        }, onClick)
        recyclerView.adapter = adapter


    }

    private val onClick:(User) -> Unit = {

    }

}