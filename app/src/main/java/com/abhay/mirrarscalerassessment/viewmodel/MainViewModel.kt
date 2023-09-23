package com.abhay.mirrarscalerassessment.viewmodel

import android.content.Context
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.abhay.mirrarscalerassessment.listeners.IOnMainActivityListener
import com.abhay.mirrarscalerassessment.listeners.NasaApodCallback
import com.abhay.mirrarscalerassessment.repository.Repository
import com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse
import com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity
import com.abhay.mirrarscalerassessment.roomDatabase.NasaApodRoomRepository
import com.abhay.mirrarscalerassessment.listeners.IOnMainActivityHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val repository: Repository,private val roomRepository: NasaApodRoomRepository): ViewModel(),
    IOnMainActivityHandler,NasaApodCallback{

    lateinit var iOnMainActivityListener: IOnMainActivityListener

    val successResponseLiveData = MutableLiveData<List<NasaApodResponse>>()
    val errorTextLiveData = MutableLiveData<String>()
    val randomNasaApodResponseEntity = MutableLiveData<NasaApodResponseEntity>()

    val webViewVisibility = ObservableField(View.INVISIBLE)
    val playButtonVisibility = ObservableField(View.GONE)
    val thumbnailImageViewVisibility = ObservableField(View.GONE)
    val progressDialogVisibility = ObservableField(View.GONE)

    fun getApiData(context: Context, count: Int){
        progressDialogVisibility.set(View.VISIBLE)
        repository.getRandomApod(context,count,true,this)

    }

    fun insertNasaApodList(list: List<NasaApodResponseEntity>){
        CoroutineScope(Dispatchers.IO).launch{
            roomRepository.deleteAllNasaApod()
            roomRepository.insertNasaApodList(list)
            setRandomNasaApodEntityFromRoomDB()
            withContext(Dispatchers.Main){
                progressDialogVisibility.set(View.INVISIBLE)
            }
        }
    }

    fun setRandomNasaApodEntityFromRoomDB(){
        CoroutineScope(Dispatchers.IO).launch{
            val nasaApodResponseEntity = roomRepository.getRandomNasaApod()
            randomNasaApodResponseEntity.postValue(nasaApodResponseEntity)
        }
    }

    override fun setThumbnailState(){
        webViewVisibility.set(View.GONE)
        playButtonVisibility.set(View.VISIBLE)
        thumbnailImageViewVisibility.set(View.GONE)
    }
    override fun setVideoState(){
        webViewVisibility.set(View.GONE)
        playButtonVisibility.set(View.VISIBLE)
        thumbnailImageViewVisibility.set(View.VISIBLE)
    }

    override fun setPlayVideoState() {
        webViewVisibility.set(View.VISIBLE)
        playButtonVisibility.set(View.GONE)
        thumbnailImageViewVisibility.set(View.GONE)
    }
    override fun onApiCallSuccessResponse(response: List<NasaApodResponse>) {
        successResponseLiveData.postValue(response)
    }

    override fun onApiCallFailureResponse(errorText: String) {
        errorTextLiveData.postValue(errorText)
        setRandomNasaApodEntityFromRoomDB()
    }

}