package com.boson.mylibrary.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.RequiresPermission;

import static android.Manifest.permission.ACCESS_NETWORK_STATE;

/**
 * Created by boson.
 * time: 2018/11/20.
 * describe:网络相关
 */
public class NetworkStatusUtils {
    private NetworkStatusUtils() {
        throw new UnsupportedOperationException("u can't instance me...");
    }

    /**
     * 判断网络是否连接
     * @return {@code true}: connected {@code false}: disconnected
     */
    @RequiresPermission(ACCESS_NETWORK_STATE)
    public static boolean isConnected() {
        NetworkInfo info = getActiveNetworkInfo();
        return info != null && info.isConnected();
    }

    @RequiresPermission(ACCESS_NETWORK_STATE)
    private static NetworkInfo getActiveNetworkInfo() {
        ConnectivityManager cm =
                (ConnectivityManager) Utils.getApplication().getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm == null) return null;
        return cm.getActiveNetworkInfo();
    }

}
