package com.abhay.mirrarscalerassessment.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/abhay/mirrarscalerassessment/repository/Repository;", "", "getRandomApod", "", "context", "Landroid/content/Context;", "count", "", "thumbs", "", "callback", "Lcom/abhay/mirrarscalerassessment/listeners/NasaApodCallback;", "app_debug"})
public abstract interface Repository {
    
    public abstract void getRandomApod(@org.jetbrains.annotations.NotNull
    android.content.Context context, int count, boolean thumbs, @org.jetbrains.annotations.NotNull
    com.abhay.mirrarscalerassessment.listeners.NasaApodCallback callback);
}