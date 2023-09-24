package com.abhay.mirrarscalerassessment.retrofit.retrofitClient


import androidx.core.os.BuildCompat
import com.abhay.mirrarscalerassessment.BuildConfig
import com.abhay.mirrarscalerassessment.retrofit.service.NasaApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class NasaApiClient {
    val apiService: NasaApiService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        apiService = retrofit.create(NasaApiService::class.java)
    }



    companion object {
        private const val BASE_URL = "https://api.nasa.gov/"
        const val API_KEY = BuildConfig.API_KEY
    }
}
