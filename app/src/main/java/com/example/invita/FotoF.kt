package com.example.invita

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FotoF : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.f_cam, container, false)

        val rv : RecyclerView = view.findViewById(R.id.rv_img)
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        val foto = ArrayList<Foto>()
        foto.addAll(Foto.getFoto())
        val fotoAdapter = FotoAdaper(foto)
        rv.adapter = fotoAdapter

        return view
    }
}
