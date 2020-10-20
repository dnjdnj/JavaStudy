package com.dnj.study.week3;

/**
 * @ClassName OverLoadTestApp
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/19
 **/
public class OverLoadTestApp {
    public static void main(String[] args) {

        String date1= OverLoadTest.sum(100, 200);
        System.out.println(date1);
        String date2= OverLoadTest.sum(100000, 5000);
        System.out.println(date2);
        String date3= OverLoadTest.sum(10, 20);
        System.out.println(date3);
        String date4= OverLoadTest.sum(5468, 589);
        System.out.println(date4);
    }
}
