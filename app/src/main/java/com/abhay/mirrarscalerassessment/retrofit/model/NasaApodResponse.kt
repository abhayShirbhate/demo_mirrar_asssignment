package com.abhay.mirrarscalerassessment.retrofit.model

import com.google.gson.annotations.SerializedName

data class NasaApodResponse(
    val date: String?,
    val explanation: String?,
    @SerializedName("media_type")
    val mediaType: String?,
    @SerializedName("service_version")
    val serviceVersion: String?,
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String?,
    val title: String?,
    val url: String?
)
