package com.abhay.mirrarscalerassessment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.abhay.mirrarscalerassessment.repository.Repository
import com.abhay.mirrarscalerassessment.roomDatabase.NasaApodRoomRepository

class MainViewModelFactory(private val repository: Repository, private val roomRepository: NasaApodRoomRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository, roomRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}