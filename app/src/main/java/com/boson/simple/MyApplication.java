package com.boson.simple;

import android.app.Application;

import com.boson.mylibrary.utils.LogUtils;

/**
 * Created by boson.
 * 创建日期: 2019-06-28.
 * describe:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.initLog(true);
    }
}
