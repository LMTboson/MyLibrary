package com.boson.mylibrary.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by boson.
 * 创建日期: 2018/5/11.
 * describe:
 */

public class DateUtils {

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 格式化时间
     *
     * @param time
     * @return
     */
    public static String getTime(long time) {
        return format(time, DEFAULT_DATE_FORMAT);
    }

    /**
     * 格式化时间,自定义标签
     *
     * @param time    时间
     * @param pattern 格式化时间用的标签 yyyy-MM-dd hh:MM:ss  HH为24小时
     * @return
     */
    public static String format(long time, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date(time));
    }

    /**
     * 获取当前日期
     *
     * @return
     */
    public static Date getCurDate() {
        return new Date(System.currentTimeMillis());
    }

    /**
     * 获取当前年份
     *
     * @return
     */
    public static int getCurYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    /**
     * 获取当前月份
     *
     * @return
     */
    public static int getCurMonth() {
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    /**
     * 获取当前是几号
     *
     * @return
     */
    public static int getCurDay() {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    //字符串转时间戳
    public static long getTimestamp(String timeString, String pattern){
        LogUtils.e(timeString + "timeString");
        LogUtils.e(pattern + "pattern");
        long l = 0;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date d;
        try{
            d = sdf.parse(timeString);
            l = d.getTime();
        } catch(ParseException e){
            e.printStackTrace();
        }
        return l;
    }

    /**
     * 通过时间秒毫秒数判断两个时间的间隔
     * @param date1 小的日期
     * @param date2 较大的时间
     * @return
     */
    public static int differentDaysByMillisecond(Date date1, Date date2)
    {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        return days;
    }

}