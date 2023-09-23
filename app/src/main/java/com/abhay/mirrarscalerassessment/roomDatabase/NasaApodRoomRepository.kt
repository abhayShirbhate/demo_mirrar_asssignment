package com.abhay.mirrarscalerassessment.roomDatabase

class NasaApodRoomRepository(private val nasaApodResponseDao: NasaApodResponseDao) {

    suspend fun insertNasaApodList(nasaApodList: List<NasaApodResponseEntity>) {
        nasaApodResponseDao.insertNasaApodList(nasaApodList)
    }

    suspend fun getAllNasaApod(): List<NasaApodResponseEntity> {
        return nasaApodResponseDao.getAllNasaApod()
    }

    suspend fun deleteAllNasaApod() {
        nasaApodResponseDao.deleteAllNasaApod()
    }
    suspend fun getRandomNasaApod(): NasaApodResponseEntity? {
        return nasaApodResponseDao.getRandomNasaApod()
    }
}
