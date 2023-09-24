package com.abhay.mirrarscalerassessment.bindingAdapter


import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.abhay.mirrarscalerassessment.R
import com.abhay.mirrarscalerassessment.listeners.IOnMainActivityHandler
import com.bumptech.glide.Glide

object MainBindingAdapter {

    @JvmStatic
    @BindingAdapter("app:imageUrl","app:url")
    fun ImageView.imageUrl(imageUrl: String?,url: String?) {
        if (imageUrl!=null) {
            Glide.with(context)
                .load(imageUrl)
                .placeholder(R.drawable.img_loading)
                .into(this)
        }else if (url != null){
            Glide.with(context)
                .load(url)
                .placeholder(R.drawable.img_loading)
                .into(this)
        }
    }

    @JvmStatic
    @BindingAdapter("app:videoUrl")
    fun WebView.videoUrl(url:String?){
        settings.javaScriptEnabled = true
        settings.pluginState = WebSettings.PluginState.ON
        webChromeClient = WebChromeClient()
        if (url != null) {
            loadUrl(url)
        }
    }


    @JvmStatic
    @BindingAdapter("app:playButtonListener")
    fun ImageView.playButtonListener(iOnMainActivityHandler: IOnMainActivityHandler){
        setOnClickListener {
            iOnMainActivityHandler.setPlayVideoState()
        }

    }


}
