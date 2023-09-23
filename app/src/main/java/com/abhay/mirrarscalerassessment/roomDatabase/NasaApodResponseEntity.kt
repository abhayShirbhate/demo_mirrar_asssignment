package com.abhay.mirrarscalerassessment.roomDatabase

import android.util.Log
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse

@Entity(tableName = "nasa_apod_table")
data class NasaApodResponseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val date: String?,
    val explanation: String?,
    val mediaType: String?,
    val serviceVersion: String?,
    val thumbnailUrl: String?,
    val title: String?,
    val url: String?
){
    companion object{
        const val VIDEO_MEDIA_TYPE = "video"
        const val IMAGE_MEDIA_TYPE = "image"


        fun getNasaApodResponseEntity(list: List<NasaApodResponse>) : List<NasaApodResponseEntity>{
            var str = ""
            list.forEach { item-> str = str.plus(item.toString()) }
            Log.e("TAG!!", "getNasaApodResponseEntity: $str", )
            return List(list.size){index ->
                NasaApodResponseEntity(
                    0L,
                    list[index].date,
                    list[index].explanation,
                    list[index].mediaType,
                    list[index].serviceVersion,
                    list[index].thumbnailUrl,
                    list[index].title,
                    list[index].url
                )
            }
        }
    }
}