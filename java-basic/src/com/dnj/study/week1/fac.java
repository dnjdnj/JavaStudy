package com.dnj.study.week1;

/**
 * @ClassName fac
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/5
 **/
public class fac {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        for(int i = 1;i <= n;i++){
            result *= i;
        }
        System.out.println(result);

    }
}

