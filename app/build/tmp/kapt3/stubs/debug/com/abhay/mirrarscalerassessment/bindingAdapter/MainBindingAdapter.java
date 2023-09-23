package com.abhay.mirrarscalerassessment.bindingAdapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\u00020\u0004*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/abhay/mirrarscalerassessment/bindingAdapter/MainBindingAdapter;", "", "()V", "imageUrl", "", "Landroid/widget/ImageView;", "", "playButtonListener", "iOnMainActivityHandler", "Lcom/abhay/mirrarscalerassessment/listeners/IOnMainActivityHandler;", "videoUrl", "Landroid/webkit/WebView;", "url", "app_debug"})
public final class MainBindingAdapter {
    @org.jetbrains.annotations.NotNull
    public static final com.abhay.mirrarscalerassessment.bindingAdapter.MainBindingAdapter INSTANCE = null;
    
    private MainBindingAdapter() {
        super();
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"app:imageUrl"})
    public static final void imageUrl(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$imageUrl, @org.jetbrains.annotations.Nullable
    java.lang.String imageUrl) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"app:videoUrl"})
    public static final void videoUrl(@org.jetbrains.annotations.NotNull
    android.webkit.WebView $this$videoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String url) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"app:playButtonListener"})
    public static final void playButtonListener(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$playButtonListener, @org.jetbrains.annotations.NotNull
    com.abhay.mirrarscalerassessment.listeners.IOnMainActivityHandler iOnMainActivityHandler) {
    }
}