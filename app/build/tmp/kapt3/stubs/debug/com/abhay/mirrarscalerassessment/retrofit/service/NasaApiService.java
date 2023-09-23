package com.abhay.mirrarscalerassessment.retrofit.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/abhay/mirrarscalerassessment/retrofit/service/NasaApiService;", "", "getRandomApod", "Lretrofit2/Call;", "", "Lcom/abhay/mirrarscalerassessment/retrofit/model/NasaApodResponse;", "apiKey", "", "count", "", "thumbs", "", "app_debug"})
public abstract interface NasaApiService {
    
    @retrofit2.http.GET(value = "planetary/apod")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<java.util.List<com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse>> getRandomApod(@retrofit2.http.Query(value = "api_key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Query(value = "count")
    int count, @retrofit2.http.Query(value = "thumbs")
    boolean thumbs);
}