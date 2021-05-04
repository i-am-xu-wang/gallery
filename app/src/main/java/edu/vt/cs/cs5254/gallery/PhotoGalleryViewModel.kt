package edu.vt.cs.cs5254.gallery

import android.graphics.drawable.Drawable
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import edu.vt.cs.cs5254.gallery.api.FlickrFetchr
import edu.vt.cs.cs5254.gallery.api.GalleryItem

class PhotoGalleryViewModel : ViewModel() {
    val galleryItemsLiveData: LiveData<List<GalleryItem>> = FlickrFetchr.galleryItemsLiveData

    fun loadPhotos() {
        FlickrFetchr.fetchPhotos()
    }

    fun storeThumbnail(id: String, drawable: Drawable) {
        FlickrFetchr.storeThumbnail(id, drawable)
    }
}