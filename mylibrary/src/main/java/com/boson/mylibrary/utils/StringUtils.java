package com.boson.mylibrary.utils;

/**
 * Created by boson.
 * time: 2018/11/19.
 * describe:
 */
public class StringUtils {
    public static String setText(String content) {
        if (content == null || content.length() == 0) {
            return "";
        }
        return content;
    }
    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }
}
