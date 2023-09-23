package com.abhay.mirrarscalerassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import com.abhay.mirrarscalerassessment.databinding.ActivityMainBinding
import com.abhay.mirrarscalerassessment.repository.RepositoryImpl
import com.abhay.mirrarscalerassessment.retrofit.retrofitClient.NasaApiClient
import com.abhay.mirrarscalerassessment.roomDatabase.NasaApodDatabase
import com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity
import com.abhay.mirrarscalerassessment.roomDatabase.NasaApodRoomRepository
import com.abhay.mirrarscalerassessment.viewmodel.MainViewModel
import com.abhay.mirrarscalerassessment.viewmodel.MainViewModelFactory
import com.abhay.mirrarscalerassessment.listeners.IOnMainActivityListener

class MainActivity : AppCompatActivity(), IOnMainActivityListener {
    lateinit var mainBinding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        initView()
        setLiveDataObserver()
        viewModel.getApiData(this, 100)


    }

    private fun initView(){
        val nasaApiClient = NasaApiClient()
        val repository = RepositoryImpl(nasaApiClient.apiService)
        val roomRepository = NasaApodRoomRepository(NasaApodDatabase.getNasaApodDatabase(this).nasaApodResponseDao())
        val mainViewsFactory = MainViewModelFactory(repository,roomRepository)
        viewModel = ViewModelProvider(this,mainViewsFactory).get(MainViewModel::class.java)
        viewModel.iOnMainActivityListener = this
        mainBinding.viewModel = viewModel
        mainBinding.iOnHandler = viewModel
        mainBinding.lifecycleOwner = this
    }

    private fun setLiveDataObserver(){
        viewModel.successResponseLiveData.observe(this){
            viewModel.insertNasaApodList(NasaApodResponseEntity.getNasaApodResponseEntity(it))
        }
        viewModel.randomNasaApodResponseEntity.observe(this){
            if (it != null) {
                mainBinding.nasaApodResponseEntity = it
                if (it.mediaType == NasaApodResponseEntity.VIDEO_MEDIA_TYPE) viewModel.setVideoState()
                else viewModel.setThumbnailState()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.custom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId==R.id.action_refresh_button) {
            viewModel.setRandomNasaApodEntityFromRoomDB()
            true

        }else{
            super.onOptionsItemSelected(item)
        }

    }



}