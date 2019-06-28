package com.boson.mylibrary.utils;

import android.app.Application;

import com.boson.mylibrary.BuildConfig;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

/**
 * Created by boson.
 * time: 2018/10/22.
 * describe:使用前必须{@link Logger}初始化
 */
public class LogUtils {
    private static boolean DEBUG = BuildConfig.DEBUG;

    public static void initLog(boolean isLoggable) {
        DEBUG = isLoggable;
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  //（可选）是否显示线程信息。 默认值为true
                .methodCount(0)         //（可选）要显示的方法行数。 默认2
                .methodOffset(7)        //（可选）隐藏内部方法调用到偏移量。 默认5
//                .logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("APPLOG")   //（可选）每个日志的全局标记。 默认PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy) {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return isLoggable;//只有线下环境才输出
            }
        });
    }

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
