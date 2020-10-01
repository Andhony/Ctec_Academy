package com.uso.ctecacademy.ui.notas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta activity contendrá información de las Notas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}