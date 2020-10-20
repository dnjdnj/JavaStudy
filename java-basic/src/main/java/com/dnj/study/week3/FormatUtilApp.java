package com.dnj.study.week3;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName FormatUtilApp
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/19
 **/
public class FormatUtilApp {
    public static void main(String[] args) throws InterruptedException, ParseException {
        //Date对象的原始输出
        //Mon Oct 19 14：36：41 CST 2020 代表什么？
        System.out.println(new Date());
        //将CST转成GMT时间
        String format = FormatUtil.format(new Date(), Locale.US);
        System.out.println(format);
        //统一格式化时间
    }
}
