package com.example.nahaloman.ui.setting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class settingViewModel extends ViewModel{

    private final MutableLiveData<String> mText;
    public LiveData<String> getText() {
        return mText;
    }

    public settingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

    }
}
