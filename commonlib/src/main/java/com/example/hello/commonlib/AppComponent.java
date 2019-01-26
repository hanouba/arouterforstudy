package com.example.hello.commonlib;

import android.content.Context;


import com.example.hello.commonlib.model.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by admin on 2017/3/10.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface AppComponent {
    Context getContext();
    DataManager getDataManager();


}
