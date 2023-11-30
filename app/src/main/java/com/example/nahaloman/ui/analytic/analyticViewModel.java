package com.example.nahaloman.ui.analytic;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class analyticViewModel extends ViewModel{

    private final MutableLiveData<String> mText;
    public LiveData<String> getText() {
        return mText;
    }

    public analyticViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

    }
}
