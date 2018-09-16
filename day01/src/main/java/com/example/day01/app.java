package com.example.day01;

import android.app.Application;

/**
 * Created by lenovo on 2018/9/15.
 */

public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        yc.getInstance().my(this);
    }
}
