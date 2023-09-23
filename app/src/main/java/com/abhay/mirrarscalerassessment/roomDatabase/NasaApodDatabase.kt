package com.abhay.mirrarscalerassessment.roomDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NasaApodResponseEntity::class], version = 1, exportSchema = false)
abstract class NasaApodDatabase : RoomDatabase() {
    abstract fun nasaApodResponseDao(): NasaApodResponseDao

    companion object{
        private var database: NasaApodDatabase? = null

        fun initialize(context: Context) {
            database = Room.databaseBuilder(
                context,
                NasaApodDatabase::class.java,
                "nasa_apod_database"
            ).build()
        }

        fun getNasaApodDatabase(context: Context): NasaApodDatabase {
            if (database == null) initialize(context)
            return database!!
        }
    }
}