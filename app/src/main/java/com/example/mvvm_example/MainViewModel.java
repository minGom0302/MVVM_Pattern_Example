package com.example.mvvm_example;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    MutableLiveData<User> user;
    private MainModel mainModel;

    public MutableLiveData<User> getUser() {
        if(user == null) {
            mainModel = new MainModel();

            user = new MutableLiveData<>();
            user.setValue(mainModel.getUser());
        }

        return user;
    }

    public void changeUser() {
        user.setValue(mainModel.getUser());
    }
}
