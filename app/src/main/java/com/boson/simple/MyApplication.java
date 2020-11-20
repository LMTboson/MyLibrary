package com.boson.simple;

import android.app.Application;

import com.boson.simple.util.LogUtils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

/**
 * Created by boson.
 * 创建日期: 2019-06-28.
 * describe:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  //（可选）是否显示线程信息。 默认值为true
                .methodCount(0)         //（可选）要显示的方法行数。 默认2
                .methodOffset(7)        //（可选）隐藏内部方法调用到偏移量。 默认5
//                .logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("APPLOG")   //（可选）每个日志的全局标记。 默认PRETTY_LOGGER
                .build();
    }
}
