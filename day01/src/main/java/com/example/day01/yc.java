package com.example.day01;

import android.content.Context;
import android.os.Environment;
import android.util.Log;


/**
 * Created by lenovo on 2018/9/15.
 */

public class yc implements Thread.UncaughtExceptionHandler {
    private static final yc ourInstance = new yc();
    private Context context;
    private Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;

    public static yc getInstance() {
        return ourInstance;
    }

    private yc() {

    }

    public  void  my(Context context){

         //捕获当前异常的方法
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.context = context;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        Log.d("aaa", "thread:" + thread);

    }
}
