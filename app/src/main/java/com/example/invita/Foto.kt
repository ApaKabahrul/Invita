package com.example.invita

import java.io.Serializable

class Foto(val imageUrl:String): Serializable {
    companion object{
        fun getFoto(): List<Foto>{
            val fotoList = ArrayList<Foto>()
            fotoList.clear()
            fotoList.add(Foto("https://blog.tripcetera.com/id/wp-content/uploads/2020/10/pulau-padar.jpg"))
            fotoList.add(Foto("https://blog.tripcetera.com/id/wp-content/uploads/2020/10/Danau-Toba-edited.jpg"))
            fotoList.add(Foto("https://blog.tripcetera.com/id/wp-content/uploads/2020/10/raja-ampat-1024x683.jpg"))
            return fotoList
        }
    }
}
