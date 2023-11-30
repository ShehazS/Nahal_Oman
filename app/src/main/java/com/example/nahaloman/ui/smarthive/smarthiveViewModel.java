package com.example.nahaloman.ui.smarthive;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class smarthiveViewModel extends ViewModel{

    private final MutableLiveData<String> mText;
    public LiveData<String> getText() {
        return mText;
    }

    public smarthiveViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

    }
}
