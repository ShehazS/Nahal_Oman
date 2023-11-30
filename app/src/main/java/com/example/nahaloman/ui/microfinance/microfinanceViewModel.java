package com.example.nahaloman.ui.microfinance;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class microfinanceViewModel extends ViewModel{

    private final MutableLiveData<String> mText;
    public LiveData<String> getText() {
        return mText;
    }

    public microfinanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

    }
}
