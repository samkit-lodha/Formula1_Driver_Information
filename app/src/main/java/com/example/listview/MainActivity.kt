package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView : ListView = findViewById(R.id.list_view)

        val arraylistofdrivers = ArrayList<DriverInfo>()

        val imageId = listOf<Int>(
            R.drawable.mv,R.drawable.lh,R.drawable.sp,R.drawable.ln,
            R.drawable.cl,R.drawable.pg,R.drawable.sv
        )

        val countryId = listOf<Int>(
            R.drawable.belgum,R.drawable.britain,R.drawable.mexico,R.drawable.britain,
            R.drawable.monaco,R.drawable.france,R.drawable.germany
        )

        val nameId = listOf<String>(
            "Max","Louis","Sergio","Lando","Charles","Pierre","Sebastian"
        )

        val lastNameId = listOf<String>(
            "Verstappen","Hamilton","Perez","Norris","Leclerc","Gasly","Vettel"
        )

        val teamId = listOf<String>(
            "Red Bull","Mercedes","Red Bull","Mc Lauren","Scuderia Ferrari","Alfa Tauri","Aston Martin"
        )

        val rankId = listOf<Int>(
            1,2,3,4,5,6,7
        )

        val pointsId = listOf<Int>(
            182,150,104,101,68,39,34
        )

        for(pos in nameId.indices){
            val newDriver = DriverInfo(imageId[pos],countryId[pos],nameId[pos],
            lastNameId[pos],teamId[pos],rankId[pos],pointsId[pos])
            arraylistofdrivers.add(newDriver)
        }

        listView.adapter = MyAdapter(this,R.layout.list_view_layoutfile,arraylistofdrivers)

        listView.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this,DriverInformation::class.java)
            intent.putExtra("nameOfDriver",arraylistofdrivers[position].dName)
            intent.putExtra("lastNameOfDriver",arraylistofdrivers[position].dLastName)
            intent.putExtra("teamOfDriver",arraylistofdrivers[position].dTeam)
            intent.putExtra("imageOfDriver",arraylistofdrivers[position].dDriverImage)
            intent.putExtra("countryImageOfDriver",arraylistofdrivers[position].dCountryImage)
            intent.putExtra("rankOfDriver",arraylistofdrivers[position].dRank)
            intent.putExtra("pointsOfDriver",arraylistofdrivers[position].dPoints)
            startActivity(intent)
        }
    }
}