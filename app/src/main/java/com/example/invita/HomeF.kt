package com.example.invita

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mapbox.mapboxsdk.maps.MapView
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback
import com.mapbox.mapboxsdk.maps.Style

class HomeF : Fragment(), OnMapReadyCallback {

    private var mapview: MapView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.f_home, container, false)

        mapview = view.findViewById(R.id.mapView)
        mapview!!.onCreate(savedInstanceState)
        mapview!!.getMapAsync(this)

        val button_nav : Button = view.findViewById(R.id.button_nav)

        button_nav.visibility = View.GONE

        button_nav.setOnClickListener {
            val i = Intent(activity, DirectionActivity::class.java)
            startActivity(i)
        }

        return view
    }

    override fun onMapReady(mapboxMap: MapboxMap) {
        mapboxMap.setStyle(Style.MAPBOX_STREETS)

        mapboxMap.addOnMapClickListener {
            Log.e("bisa", "bisa")
            val gmmIntentUri: Uri = Uri.parse("google.navigation:q=-6.226200,106.826600")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
            false }
    }

    override fun onResume() {
        super.onResume()
        mapview!!.onResume()
    }

    override fun onStart() {
        super.onStart()
        mapview!!.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapview!!.onStop()
    }

    override fun onPause() {
        super.onPause()
        mapview!!.onPause()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapview!!.onLowMemory()
    }

    override fun onDestroy() {
        mapview!!.onDestroy()
        super.onDestroy()
    }

    override fun onDestroyView() {
        mapview!!.onDestroy()
        super.onDestroyView()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapview!!.onSaveInstanceState(outState)
    }
}
