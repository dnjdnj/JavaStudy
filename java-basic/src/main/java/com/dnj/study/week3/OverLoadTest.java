package com.dnj.study.week3;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/19
 **/
public class OverLoadTest {
    public static Integer sum(Integer a,Integer b){
        return a + b;
    }
    public static String sum(String s1,String s2){
        return s1 + s2;
    }
    public static String sum(int i1,int i2){
        String sum ="";
        int second = i1+i2;
        int day = second / (24 * 60 * 60);
        int hour= second / (60 * 60) - day * 24;
        int minute = (second - day * 24 * 60 * 60 - hour * 60 * 60) / 60;
        if(day != 0){
            sum += day + "天";
            second -= day*86400;
        }
        if(hour != 0 ){
            sum += hour + "小时";
            second -= hour*3600;
        }
        if (minute != 0){
            sum += minute + "分钟";
            second -= minute*60;
        }
        if(second != 0){
            sum += second + "秒";
        }
        return  sum;
    }
}
