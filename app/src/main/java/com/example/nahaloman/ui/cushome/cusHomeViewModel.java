package com.example.nahaloman.ui.cushome;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class cusHomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public cusHomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}