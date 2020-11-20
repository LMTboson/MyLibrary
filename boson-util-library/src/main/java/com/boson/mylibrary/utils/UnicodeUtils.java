package com.boson.mylibrary.utils;

/**
 * Created by boson.
 * time: 2018/11/20.
 * describe:
 */
public class UnicodeUtils {
    /**
     * unicode 转字符串
     */
    public static String unicodeToString(String unicode) {

        StringBuffer string = new StringBuffer();

        String[] hex = unicode.split("\\\\u");

        for (int i = 1; i < hex.length; i++) {
            // 转换出每一个代码点
            int data = Integer.parseInt(hex[i], 16);
            // 追加成string
            string.append((char) data);
        }

        return string.toString();
    }
}
