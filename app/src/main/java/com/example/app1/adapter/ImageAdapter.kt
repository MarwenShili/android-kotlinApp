package com.example.app1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.app1.R

class ImageAdapter(private val layoutId: Int) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    //ranger tout les composant
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        //image
        val image = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(layoutId, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 8
    }

}