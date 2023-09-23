package com.abhay.mirrarscalerassessment.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0016J\u0014\u0010,\u001a\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0 J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0016\u00100\u001a\u00020(2\f\u00101\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\b\u00102\u001a\u00020(H\u0016J\u0006\u00103\u001a\u00020(J\b\u00104\u001a\u00020(H\u0016J\b\u00105\u001a\u00020(H\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\rR\u001f\u0010#\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019\u00a8\u00066"}, d2 = {"Lcom/abhay/mirrarscalerassessment/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/abhay/mirrarscalerassessment/listeners/IOnMainActivityHandler;", "Lcom/abhay/mirrarscalerassessment/listeners/NasaApodCallback;", "repository", "Lcom/abhay/mirrarscalerassessment/repository/Repository;", "roomRepository", "Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodRoomRepository;", "(Lcom/abhay/mirrarscalerassessment/repository/Repository;Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodRoomRepository;)V", "errorTextLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorTextLiveData", "()Landroidx/lifecycle/MutableLiveData;", "iOnMainActivityListener", "Lcom/abhay/mirrarscalerassessment/listeners/IOnMainActivityListener;", "getIOnMainActivityListener", "()Lcom/abhay/mirrarscalerassessment/listeners/IOnMainActivityListener;", "setIOnMainActivityListener", "(Lcom/abhay/mirrarscalerassessment/listeners/IOnMainActivityListener;)V", "playButtonVisibility", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getPlayButtonVisibility", "()Landroidx/databinding/ObservableField;", "progressDialogVisibility", "getProgressDialogVisibility", "randomNasaApodResponseEntity", "Lcom/abhay/mirrarscalerassessment/roomDatabase/NasaApodResponseEntity;", "getRandomNasaApodResponseEntity", "successResponseLiveData", "", "Lcom/abhay/mirrarscalerassessment/retrofit/model/NasaApodResponse;", "getSuccessResponseLiveData", "thumbnailImageViewVisibility", "getThumbnailImageViewVisibility", "webViewVisibility", "getWebViewVisibility", "getApiData", "", "context", "Landroid/content/Context;", "count", "insertNasaApodList", "list", "onApiCallFailureResponse", "errorText", "onApiCallSuccessResponse", "response", "setPlayVideoState", "setRandomNasaApodEntityFromRoomDB", "setThumbnailState", "setVideoState", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel implements com.abhay.mirrarscalerassessment.listeners.IOnMainActivityHandler, com.abhay.mirrarscalerassessment.listeners.NasaApodCallback {
    @org.jetbrains.annotations.NotNull
    private final com.abhay.mirrarscalerassessment.repository.Repository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.abhay.mirrarscalerassessment.roomDatabase.NasaApodRoomRepository roomRepository = null;
    public com.abhay.mirrarscalerassessment.listeners.IOnMainActivityListener iOnMainActivityListener;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse>> successResponseLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorTextLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity> randomNasaApodResponseEntity = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.Integer> webViewVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.Integer> playButtonVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.Integer> thumbnailImageViewVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.Integer> progressDialogVisibility = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.abhay.mirrarscalerassessment.repository.Repository repository, @org.jetbrains.annotations.NotNull
    com.abhay.mirrarscalerassessment.roomDatabase.NasaApodRoomRepository roomRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.abhay.mirrarscalerassessment.listeners.IOnMainActivityListener getIOnMainActivityListener() {
        return null;
    }
    
    public final void setIOnMainActivityListener(@org.jetbrains.annotations.NotNull
    com.abhay.mirrarscalerassessment.listeners.IOnMainActivityListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse>> getSuccessResponseLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorTextLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity> getRandomNasaApodResponseEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.Integer> getWebViewVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.Integer> getPlayButtonVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.Integer> getThumbnailImageViewVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.Integer> getProgressDialogVisibility() {
        return null;
    }
    
    public final void getApiData(@org.jetbrains.annotations.NotNull
    android.content.Context context, int count) {
    }
    
    public final void insertNasaApodList(@org.jetbrains.annotations.NotNull
    java.util.List<com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity> list) {
    }
    
    public final void setRandomNasaApodEntityFromRoomDB() {
    }
    
    @java.lang.Override
    public void setThumbnailState() {
    }
    
    @java.lang.Override
    public void setVideoState() {
    }
    
    @java.lang.Override
    public void setPlayVideoState() {
    }
    
    @java.lang.Override
    public void onApiCallSuccessResponse(@org.jetbrains.annotations.NotNull
    java.util.List<com.abhay.mirrarscalerassessment.retrofit.model.NasaApodResponse> response) {
    }
    
    @java.lang.Override
    public void onApiCallFailureResponse(@org.jetbrains.annotations.NotNull
    java.lang.String errorText) {
    }
}