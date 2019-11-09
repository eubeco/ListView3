package com.example.listview_ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val versiones = ArrayList<AndroidVersion>()
        versiones.add(AndroidVersion("Android", R.drawable.logo))
        versiones.add(AndroidVersion("CupCake", R.drawable.cupcake ))
        versiones.add(AndroidVersion("Donut", R.drawable.donut))
        versiones.add(AndroidVersion("Eclair", R.drawable.eclair))

        val lista_versiones = findViewById(R.id.lista_logos) as ListView

        val adaptador = VersionesAdapter(this, versiones)

        lista_versiones.adapter=adaptador

        lista_versiones.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, "" + position, Toast.LENGTH_SHORT).show()
            }
        })




/*
        *//*val logos = arrayOf("Android", "CupCake", "Donut", "Eclair")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, logos)

        val lista_logos = findViewById(R.id.lista_logos) as ListView
        lista_logos.adapter = adaptador*//*




        lista_logos.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
                Toast.makeText(applicationContext, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
            }
        })*/
    }
}
