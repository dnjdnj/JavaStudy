package com.dnj.study.week3;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Point
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/19
 **/
@Data
@Builder


public class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("点被初始化");
    }

    public Point(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("带参数的点被初始化");
    }

    public void print(){
        System.out.println("横坐标：" + x +"，纵坐标：" + y);
    }

}
