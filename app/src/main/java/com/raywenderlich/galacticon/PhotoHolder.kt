package com.raywenderlich.galacticon

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_item_row.view.*

//allowing it to be used as a ViewHolder for the adapter
class PhotoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
    //
    private var view: View = v
    private var photo: Photo? = null

    //
    init {
        v.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val context = itemView.context
        val showPhotoIntent = Intent(context, PhotoActivity::class.java)
        showPhotoIntent.putExtra(PHOTO_KEY, photo)
        context.startActivity(showPhotoIntent)
    }

    //bind photo to photoholder
    fun bindPhoto(photo: Photo) {
        this.photo = photo
        Picasso.with(view.context).load(photo.url).into(view.itemImage)
        Log.d("LOG API", photo.humanDate)
        view.itemDate.text = photo.humanDate
        view.itemDescription.text = photo.explanation
    }

    //added key for easier reference
    companion object {
        private const val PHOTO_KEY = "PHOTO"
    }
}