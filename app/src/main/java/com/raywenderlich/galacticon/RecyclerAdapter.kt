package com.raywenderlich.galacticon

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup


class RecyclerAdapter(private val photos: ArrayList<Photo>) : RecyclerView.Adapter<PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PhotoHolder? {
        val inflatedView = parent!!.inflate(R.layout.recycler_item_row, false)
        return PhotoHolder(inflatedView)
    }

    override fun getItemCount(): Int = photos.size

    override fun onBindViewHolder(holder: PhotoHolder?, position: Int) {
        val itemPhoto = photos[position]
        holder?.bindPhoto(itemPhoto)
    }

}

