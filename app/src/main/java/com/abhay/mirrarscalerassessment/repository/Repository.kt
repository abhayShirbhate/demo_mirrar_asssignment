package com.abhay.mirrarscalerassessment.repository

import android.content.Context
import com.abhay.mirrarscalerassessment.listeners.NasaApodCallback

interface Repository {
    fun getRandomApod(context: Context, count: Int, thumbs:Boolean, callback: NasaApodCallback)
}