package com.dnj.study.week3;

import javax.xml.crypto.Data;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/19
 **/
public class FormatUtil {
    /**
     * 将Date对象格式化为"yyyy-MM-dd HH:mm:ss"的格式
     *
     * @param date
     * @return
     */
    public static String format(Data date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 将Date对象格式化为传入的制定格式反回
     *
     * @param date
     * @param regex
     * @return
     */
    public static String format(Date date, String regex){
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        return sdf.format(date);
    }

    /**
     * 将入参的double数据格式化为两位小数反回
     *
     * @param number
     * @return
     */
    public static String format(double number){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(number);
    }

    /**
     * 将入参的double数据格式化为指定格式反回
     *
     * @param number
     * @return
     */
    public static String format(double number,String regex){
        DecimalFormat decimalFormat = new DecimalFormat(regex);
        return decimalFormat.format(number);
    }

    /**
     *
     */
    public  static String format(Date date, Locale tz){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",tz);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sdf.format(date.getTime());
    }
}
