package com.abhay.mirrarscalerassessment.listeners

import com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse

interface NasaApodCallback {
    fun onApiCallSuccessResponse(response:List<NasaApodResponse>)
    fun onApiCallFailureResponse(errorText:String)
}