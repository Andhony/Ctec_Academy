package com.uso.ctecacademy.ui.horario;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HorarioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HorarioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta activity contendrá información del Horario");
    }

    public LiveData<String> getText() {
        return mText;
    }
}