package com.boson.mylibrary.utils;

import com.boson.mylibrary.BuildConfig;
import com.orhanobut.logger.Logger;

/**
 * Created by boson.
 * time: 2018/10/22.
 * describe:使用前必须{@link Logger}初始化
 */
public class LogUtils {
    private static final boolean DEBUG = BuildConfig.DEBUG;

    public static void d(String TAG, String msg){
        if (DEBUG) {
            Logger.t(TAG).d(msg);
        }
    }

    public static void d(String msg){
        if (DEBUG) {
            Logger.d(msg);
        }
    }

    public static void i(String TAG, String msg){
        if (DEBUG) {
            Logger.t(TAG).i(msg);
        }
    }

    public static void i(String msg){
        if (DEBUG) {
            Logger.i(msg);
        }
    }

    public static void w(String TAG, String msg){
        if (DEBUG) {
            Logger.t(TAG).w(msg);
        }
    }

    public static void w(String msg){
        if (DEBUG) {
            Logger.w(msg);
        }
    }

    public static void e(String msg){
        if (DEBUG) {
            Logger.e(msg);
        }
    }

    public static void e(String TAG, String msg){
        if (DEBUG) {
            Logger.t(TAG).e(msg);
        }
    }

    public static void json(String msg){
        if (DEBUG) {
            Logger.json(msg);
        }
    }

    public static void json(String TAG, String msg){
        if (DEBUG) {
            Logger.t(TAG).json(msg);
        }
    }
}
