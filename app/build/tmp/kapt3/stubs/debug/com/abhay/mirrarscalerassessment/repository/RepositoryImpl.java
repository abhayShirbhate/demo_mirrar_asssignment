package com.abhay.mirrarscalerassessment.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/abhay/mirrarscalerassessment/repository/RepositoryImpl;", "Lcom/abhay/mirrarscalerassessment/repository/Repository;", "apiService", "Lcom/abhay/mirrarscalerassessment/retrofit/service/NasaApiService;", "(Lcom/abhay/mirrarscalerassessment/retrofit/service/NasaApiService;)V", "getRandomApod", "", "context", "Landroid/content/Context;", "count", "", "thumbs", "", "callback", "Lcom/abhay/mirrarscalerassessment/listeners/NasaApodCallback;", "app_debug"})
public final class RepositoryImpl implements com.abhay.mirrarscalerassessment.repository.Repository {
    @org.jetbrains.annotations.NotNull
    private final com.abhay.mirrarscalerassessment.retrofit.service.NasaApiService apiService = null;
    
    public RepositoryImpl(@org.jetbrains.annotations.NotNull
    com.abhay.mirrarscalerassessment.retrofit.service.NasaApiService apiService) {
        super();
    }
    
    @java.lang.Override
    public void getRandomApod(@org.jetbrains.annotations.NotNull
    android.content.Context context, int count, boolean thumbs, @org.jetbrains.annotations.NotNull
    com.abhay.mirrarscalerassessment.listeners.NasaApodCallback callback) {
    }
}