package com.abhay.mirrarscalerassessment.databinding;
import com.abhay.mirrarscalerassessment.R;
import com.abhay.mirrarscalerassessment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.media_layout, 8);
        sViewsWithIds.put(R.id.scrollView, 9);
        sViewsWithIds.put(R.id.progressBar, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.ScrollView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.webkit.WebView) bindings[2]
            );
        this.dateTextView.setTag(null);
        this.explanationTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (android.widget.FrameLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.playButton.setTag(null);
        this.thumbnailImageView.setTag(null);
        this.titleTextView.setTag(null);
        this.webView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.nasaApodResponseEntity == variableId) {
            setNasaApodResponseEntity((com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity) variable);
        }
        else if (BR.iOnHandler == variableId) {
            setIOnHandler((com.abhay.mirrarscalerassessment.listeners.IOnMainActivityHandler) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.abhay.mirrarscalerassessment.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNasaApodResponseEntity(@Nullable com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity NasaApodResponseEntity) {
        this.mNasaApodResponseEntity = NasaApodResponseEntity;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.nasaApodResponseEntity);
        super.requestRebind();
    }
    public void setIOnHandler(@Nullable com.abhay.mirrarscalerassessment.listeners.IOnMainActivityHandler IOnHandler) {
        this.mIOnHandler = IOnHandler;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.iOnHandler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.abhay.mirrarscalerassessment.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelProgressDialogVisibility((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelWebViewVisibility((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeViewModelPlayButtonVisibility((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewModelThumbnailImageViewVisibility((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelProgressDialogVisibility(androidx.databinding.ObservableField<java.lang.Integer> ViewModelProgressDialogVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWebViewVisibility(androidx.databinding.ObservableField<java.lang.Integer> ViewModelWebViewVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPlayButtonVisibility(androidx.databinding.ObservableField<java.lang.Integer> ViewModelPlayButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelThumbnailImageViewVisibility(androidx.databinding.ObservableField<java.lang.Integer> ViewModelThumbnailImageViewVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int androidxDatabindingViewDataBindingSafeUnboxViewModelThumbnailImageViewVisibilityGet = 0;
        java.lang.String nasaApodResponseEntityTitle = null;
        androidx.databinding.ObservableField<java.lang.Integer> viewModelProgressDialogVisibility = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelProgressDialogVisibilityGet = 0;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelWebViewVisibilityGet = 0;
        com.abhay.mirrarscalerassessment.roomDatabase.NasaApodResponseEntity nasaApodResponseEntity = mNasaApodResponseEntity;
        java.lang.String nasaApodResponseEntityUrl = null;
        androidx.databinding.ObservableField<java.lang.Integer> viewModelWebViewVisibility = null;
        java.lang.String nasaApodResponseEntityThumbnailUrl = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelPlayButtonVisibilityGet = 0;
        com.abhay.mirrarscalerassessment.listeners.IOnMainActivityHandler iOnHandler = mIOnHandler;
        androidx.databinding.ObservableField<java.lang.Integer> viewModelPlayButtonVisibility = null;
        java.lang.String nasaApodResponseEntityDate = null;
        java.lang.Integer viewModelProgressDialogVisibilityGet = null;
        java.lang.Integer viewModelPlayButtonVisibilityGet = null;
        java.lang.String nasaApodResponseEntityExplanation = null;
        java.lang.Integer viewModelWebViewVisibilityGet = null;
        com.abhay.mirrarscalerassessment.viewmodel.MainViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.Integer> viewModelThumbnailImageViewVisibility = null;
        java.lang.Integer viewModelThumbnailImageViewVisibilityGet = null;

        if ((dirtyFlags & 0x90L) != 0) {



                if (nasaApodResponseEntity != null) {
                    // read nasaApodResponseEntity.title
                    nasaApodResponseEntityTitle = nasaApodResponseEntity.getTitle();
                    // read nasaApodResponseEntity.url
                    nasaApodResponseEntityUrl = nasaApodResponseEntity.getUrl();
                    // read nasaApodResponseEntity.thumbnailUrl
                    nasaApodResponseEntityThumbnailUrl = nasaApodResponseEntity.getThumbnailUrl();
                    // read nasaApodResponseEntity.date
                    nasaApodResponseEntityDate = nasaApodResponseEntity.getDate();
                    // read nasaApodResponseEntity.explanation
                    nasaApodResponseEntityExplanation = nasaApodResponseEntity.getExplanation();
                }
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xcfL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.progressDialogVisibility
                        viewModelProgressDialogVisibility = viewModel.getProgressDialogVisibility();
                    }
                    updateRegistration(0, viewModelProgressDialogVisibility);


                    if (viewModelProgressDialogVisibility != null) {
                        // read viewModel.progressDialogVisibility.get()
                        viewModelProgressDialogVisibilityGet = viewModelProgressDialogVisibility.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.progressDialogVisibility.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelProgressDialogVisibilityGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelProgressDialogVisibilityGet);
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.webViewVisibility
                        viewModelWebViewVisibility = viewModel.getWebViewVisibility();
                    }
                    updateRegistration(1, viewModelWebViewVisibility);


                    if (viewModelWebViewVisibility != null) {
                        // read viewModel.webViewVisibility.get()
                        viewModelWebViewVisibilityGet = viewModelWebViewVisibility.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.webViewVisibility.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelWebViewVisibilityGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelWebViewVisibilityGet);
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.playButtonVisibility
                        viewModelPlayButtonVisibility = viewModel.getPlayButtonVisibility();
                    }
                    updateRegistration(2, viewModelPlayButtonVisibility);


                    if (viewModelPlayButtonVisibility != null) {
                        // read viewModel.playButtonVisibility.get()
                        viewModelPlayButtonVisibilityGet = viewModelPlayButtonVisibility.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.playButtonVisibility.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelPlayButtonVisibilityGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelPlayButtonVisibilityGet);
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.thumbnailImageViewVisibility
                        viewModelThumbnailImageViewVisibility = viewModel.getThumbnailImageViewVisibility();
                    }
                    updateRegistration(3, viewModelThumbnailImageViewVisibility);


                    if (viewModelThumbnailImageViewVisibility != null) {
                        // read viewModel.thumbnailImageViewVisibility.get()
                        viewModelThumbnailImageViewVisibilityGet = viewModelThumbnailImageViewVisibility.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.thumbnailImageViewVisibility.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelThumbnailImageViewVisibilityGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelThumbnailImageViewVisibilityGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateTextView, nasaApodResponseEntityDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.explanationTextView, nasaApodResponseEntityExplanation);
            com.abhay.mirrarscalerassessment.bindingAdapter.MainBindingAdapter.imageUrl(this.thumbnailImageView, nasaApodResponseEntityThumbnailUrl, nasaApodResponseEntityUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, nasaApodResponseEntityTitle);
            com.abhay.mirrarscalerassessment.bindingAdapter.MainBindingAdapter.videoUrl(this.webView, nasaApodResponseEntityUrl);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewModelProgressDialogVisibilityGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.playButton.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewModelPlayButtonVisibilityGet);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            com.abhay.mirrarscalerassessment.bindingAdapter.MainBindingAdapter.playButtonListener(this.playButton, iOnHandler);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            this.thumbnailImageView.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewModelThumbnailImageViewVisibilityGet);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.webView.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewModelWebViewVisibilityGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.progressDialogVisibility
        flag 1 (0x2L): viewModel.webViewVisibility
        flag 2 (0x3L): viewModel.playButtonVisibility
        flag 3 (0x4L): viewModel.thumbnailImageViewVisibility
        flag 4 (0x5L): nasaApodResponseEntity
        flag 5 (0x6L): iOnHandler
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}