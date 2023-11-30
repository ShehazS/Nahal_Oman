package com.example.nahaloman.ui.insurance;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class insuranceViewModel extends ViewModel{

    private final MutableLiveData<String> mText;
    public LiveData<String> getText() {
        return mText;
    }
    public insuranceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

    }
}
