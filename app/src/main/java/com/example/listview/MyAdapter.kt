package com.example.listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var context: Activity,var resource : Int, var listArrayList : ArrayList<DriverInfo>) :
    ArrayAdapter<DriverInfo>(context,resource,listArrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var layoutInflater : LayoutInflater = LayoutInflater.from(context)
        var view : View = layoutInflater.inflate(resource,null)
        val driversImageView : ImageView = view.findViewById(R.id.profileImage)
        val countryImageView : ImageView = view.findViewById(R.id.countryImage)
        val driversFirstName : TextView = view.findViewById(R.id.driverName)
        val driversLastName : TextView = view.findViewById(R.id.driverLastName)

        driversFirstName.text=listArrayList[position].dName
        driversLastName.text=listArrayList[position].dLastName
        driversImageView.setImageResource(listArrayList[position].dDriverImage)
        countryImageView.setImageResource(listArrayList[position].dCountryImage)

        return view
    }
}