package com.boson.mylibrary.utils;

import android.text.TextUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by boson.
 * time: 2018/11/2.
 * describe:MD5加密 参数加密等加密处理
 */
public class EncryptUtils {

    public static String MD5(String info) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(info.getBytes("UTF-8"));
            byte[] encryption = md5.digest();

            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < encryption.length; i++) {
                if (Integer.toHexString(0xff & encryption[i]).length() == 1) {
                    strBuf.append("0").append(Integer.toHexString(0xff & encryption[i]));
                } else {
                    strBuf.append(Integer.toHexString(0xff & encryption[i]));
                }
            }

            return strBuf.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /**
     *
     * app中需要用到的加密规则
     *
     * @param string 需要加密的密码字符串
     * @return app加密后的密码。
     */
    public static String getMd5Password(String string) {
        String str = MD5(MD5(string) + "JNW_DIARY");
        if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            return str;
        }
    }

}
