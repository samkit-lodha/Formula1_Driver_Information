package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DriverInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_information)

        findViewById<ImageView>(R.id.countryImage2).setImageResource(intent.getIntExtra("countryImageOfDriver",0))
        findViewById<ImageView>(R.id.driverImage2).setImageResource(intent.getIntExtra("imageOfDriver",0))
        findViewById<TextView>(R.id.driverName2).text=intent.getStringExtra("nameOfDriver")
        findViewById<TextView>(R.id.driverLastName2).text=intent.getStringExtra("lastNameOfDriver")
        findViewById<TextView>(R.id.teamName2).text=intent.getStringExtra("teamOfDriver")
        findViewById<TextView>(R.id.points2).text=intent.getIntExtra("pointsOfDriver",1).toString()
        findViewById<TextView>(R.id.rank2).text=intent.getIntExtra("rankOfDriver",1).toString()
    }
}