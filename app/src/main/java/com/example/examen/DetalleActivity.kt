package com.example.examen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle)

        val libroSeleccionado = intent.getStringExtra("libro")

        var libros = listOf<Libro>(
            Libro("Principito", "Juan Carlos",
                "2000"),
            Libro("El amor", "Ana Laura",
                "2006"),
            Libro("Vivir y morir", "Pedro Sanchez",
                "2013")
        )

        var rvLibro: RecyclerView = findViewById<RecyclerView>(R.id.rvLibros)
        rvLibro.layoutManager = GridLayoutManager(this, 2)
        val adapter: LibroAdapter = LibroAdapter(libros, this)
        rvLibro.adapter = adapter

    }
}