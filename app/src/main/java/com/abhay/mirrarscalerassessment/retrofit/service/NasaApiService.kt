package com.abhay.mirrarscalerassessment.retrofit.service

import com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface NasaApiService {

    @GET("planetary/apod")
    fun getRandomApod(
        @Query("api_key") apiKey: String,
        @Query("count") count: Int,
        @Query("thumbs") thumbs: Boolean,
    ): Call<List<NasaApodResponse>>


}