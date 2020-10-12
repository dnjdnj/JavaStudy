package com.dnj.study.week1;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArrayList
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/5
 **/
public class ArrayList {
    static int MAX = 5;
    public static void main(String[] args) {
        int[] a = new int[MAX];
        Random random = new Random();
        for(int i = 0;i < MAX;i++){
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        findmax(a);
        findmin(a);
        sum(a);
        Arrays.sort(a);
        System.out.println("使用Arrays.sort()排序" + Arrays.toString(a));
        BS(a);

    }
    public static void findmax(int[] a){
        int i = 0;
        int max = a[i] ;
        while(i < a.length){
            if(a[i] > max){
                max = a[i];
            }
            i++;
        }
        System.out.println("最大值为:" + max);
    }

    public static void findmin(int[] a){
        int min = a[0];
       for(int i = 0;i < a.length;i++){
           if(a[i] < min){
               min = a[i];
           }
       }
        System.out.println("最大值为:" + min);
    }

    public static void sum(int[] a){
        int sum = 0;
        for(int i = 0;i < a.length;i++){
            sum += a[i];
        }
        System.out.println("和为:" + sum);
    }

    public static void BS(int[] a){
        for(int i = 0;i < a.length-1 ;i++){
            for(int j = 0;j < i;j++){
                if(a[j]>a[j+1]){
                    int medival = a[j];
                    a[j] = a[j+1];
                    a[j+1] = medival;
                }
            }
        }
        System.out.println("冒泡排序：" + Arrays.toString(a));
    }

}
