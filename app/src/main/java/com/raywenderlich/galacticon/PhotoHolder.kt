package com.raywenderlich.galacticon

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View

//allowing it to be used as a ViewHolder for the adapter
class PhotoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
    //
    private var view: View = v
    private var photo: Photo? = null

    //
    init {
        v.setOnClickListener { this }
    }

    override fun onClick(v: View?) {
        Log.d("RecylerView", "CLICK!")
    }

    companion object {
        private val PHOTO_KEY = "PHOTO"
    }

}