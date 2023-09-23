package com.abhay.mirrarscalerassessment.roomDatabase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodResponseDao;", "", "deleteAllNasaApod", "", "getAllNasaApod", "", "Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodResponseEntity;", "getRandomNasaApod", "insertNasaApodList", "nasaApodList", "app_debug"})
@androidx.room.Dao
public abstract interface NasaApodResponseDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertNasaApodList(@org.jetbrains.annotations.NotNull
    java.util.List<com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity> nasaApodList);
    
    @androidx.room.Query(value = "SELECT * FROM nasa_apod_table")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity> getAllNasaApod();
    
    @androidx.room.Query(value = "DELETE FROM nasa_apod_table")
    public abstract void deleteAllNasaApod();
    
    @androidx.room.Query(value = "SELECT * FROM nasa_apod_table ORDER BY RANDOM() LIMIT 1")
    @org.jetbrains.annotations.Nullable
    public abstract com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity getRandomNasaApod();
}