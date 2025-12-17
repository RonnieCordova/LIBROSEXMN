package com.example.examen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listaLibros: ListView = findViewById<ListView>(R.id.listalibros)
        val libros = listOf<String>("Principito", "El amor", "Vivir y morir")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            libros)
        listaLibros.adapter = adaptador

        listaLibros.setOnItemClickListener()
        { parent: AdapterView<*>, view: View, position: Int, id: Long->
            val nombre = libros[position]
            val i: Intent = Intent(this, DetalleActivity::class.java)
            i.putExtra("libro", nombre)
            startActivity(i)
        }
    }
}