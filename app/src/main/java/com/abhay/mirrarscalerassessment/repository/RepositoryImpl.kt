package com.abhay.mirrarscalerassessment.repository

import android.content.Context
import com.abhay.mirrarscalerassessment.R
import com.abhay.mirrarscalerassessment.listeners.NasaApodCallback
import com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse
import com.abhay.mirrarscalerassessment.retrofit.retrofitClient.NasaApiClient
import com.abhay.mirrarscalerassessment.retrofit.service.NasaApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class RepositoryImpl(private val apiService: NasaApiService): Repository {

    override fun getRandomApod(context: Context, count: Int, thumbs:Boolean, callback: NasaApodCallback) {
        apiService.getRandomApod(NasaApiClient.API_KEY, count,thumbs)
            .enqueue(object : Callback<List<NasaApodResponse>?> {
                override fun onResponse(
                    call: Call<List<NasaApodResponse>?>,
                    response: Response<List<NasaApodResponse>?>
                ) {
                    if (response.isSuccessful && response.body() != null) {
                        callback.onApiCallSuccessResponse(response.body()!!)
                    } else {
                        callback.onApiCallFailureResponse(response.message())
                    }
                }

                override fun onFailure(call: Call<List<NasaApodResponse>?>, t: Throwable) {
                    if (t is SocketTimeoutException || t is UnknownHostException){
                        callback.onApiCallFailureResponse(context.getString(R.string.no_internet_connection_msg))
                    }else callback.onApiCallFailureResponse(t.message?:context.getString(R.string.some_thing_went_wrong_msg))
                }
            })
    }

}