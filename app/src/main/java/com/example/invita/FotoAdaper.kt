package com.example.invita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class FotoAdaper(private val fotoList: ArrayList<Foto>) : RecyclerView.Adapter<FotoAdaper.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(foto: Foto){
            val img = itemView.findViewById<ImageView>(R.id.foto)
            Picasso.get().load(foto.imageUrl).into(img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.photo_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(fotoList[position])
    }

    override fun getItemCount(): Int {
        return fotoList.size
    }

}
