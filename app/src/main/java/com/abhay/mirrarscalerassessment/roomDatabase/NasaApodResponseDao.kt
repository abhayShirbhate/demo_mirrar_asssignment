package com.abhay.mirrarscalerassessment.roomDatabase

import androidx.room.*

@Dao
interface NasaApodResponseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNasaApodList(nasaApodList: List<NasaApodResponseEntity>)

    @Query("SELECT * FROM nasa_apod_table")
    fun getAllNasaApod(): List<NasaApodResponseEntity>

    @Query("DELETE FROM nasa_apod_table")
    fun deleteAllNasaApod()

    @Query("SELECT * FROM nasa_apod_table ORDER BY RANDOM() LIMIT 1")
    fun getRandomNasaApod(): NasaApodResponseEntity?
}