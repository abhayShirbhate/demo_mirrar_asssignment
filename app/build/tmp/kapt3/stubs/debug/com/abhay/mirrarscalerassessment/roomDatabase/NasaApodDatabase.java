package com.abhay.mirrarscalerassessment.roomDatabase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodDatabase;", "Landroidx/room/RoomDatabase;", "()V", "nasaApodResponseDao", "Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodResponseDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity.class}, version = 1, exportSchema = false)
public abstract class NasaApodDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable
    private static com.abhay.mirrarscalerassessment.roomDatabase.NasaApodDatabase database;
    @org.jetbrains.annotations.NotNull
    public static final com.abhay.mirrarscalerassessment.roomDatabase.NasaApodDatabase.Companion Companion = null;
    
    public NasaApodDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseDao nasaApodResponseDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodDatabase$Companion;", "", "()V", "database", "Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodDatabase;", "getNasaApodDatabase", "context", "Landroid/content/Context;", "initialize", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.abhay.mirrarscalerassessment.roomDatabase.NasaApodDatabase getNasaApodDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}