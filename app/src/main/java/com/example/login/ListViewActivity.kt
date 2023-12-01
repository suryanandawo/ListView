package com.example.login

import AdapterCustom
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var namanama = arrayOf<String>(
            "Teja Paku Alam",
            "Alberto",
            "Nick Kuipers",
            "Henhen Herdiana",
            "Mark Klok",
            "Ciro Alves",
            "Rezaldi Hehanusa",
            "Levy Madinda",
            "Dedi Kusnandar",
            "Beckham Putra",
            "David Da Silva"
        )

        var fotofoto = arrayOf<Int>(
            R.drawable.teja,
            R.drawable.alberto,
            R.drawable.nick,
            R.drawable.henhen,
            R.drawable.mark,
            R.drawable.ciro,
            R.drawable.rezaldi,
            R.drawable.levy,
            R.drawable.dedi,
            R.drawable.beckham,
            R.drawable.david
        )
        // definisi list view
        val _list = findViewById<ListView>(R.id.listview3)
        //_list.adapter = ArrayAdapter( this,android.R.layout.simple_list_item_1,namanama)
        _list.adapter = AdapterCustom(this, namanama, fotofoto)
        _list.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(
                this,
                "item yang diklik adalah: " + _list.getItemAtPosition(i),
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}