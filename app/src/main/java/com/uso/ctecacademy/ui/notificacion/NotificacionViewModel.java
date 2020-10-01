package com.uso.ctecacademy.ui.notificacion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificacionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificacionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta activity contendrá información de notificaciones");
    }

    public LiveData<String> getText() {
        return mText;
    }
}