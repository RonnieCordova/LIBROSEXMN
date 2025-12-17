package com.example.examen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LibroAdapter(val libros: List<Libro>,
                   val activity: DetalleActivity):
    RecyclerView.Adapter<LibroAdapter.LibroViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LibroViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_libros, parent,
                false)
        return LibroViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: LibroViewHolder,
        position: Int
    ) {
        val libro: Libro = libros[position]
        holder.tvTitulo.text = libro.titulo
        holder.tvAutor.text = libro.autor
        holder.tvAño.text = libro.año
    }

    override fun getItemCount(): Int {
        return libros.size
    }

    class LibroViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvTitulo: TextView = view.findViewById<TextView>(R.id.tvTitulo)
        val tvAutor: TextView = view.findViewById<TextView>(R.id.tvAutor)
        val tvAño: TextView = view.findViewById<TextView>(R.id.tvAño)
    }

}