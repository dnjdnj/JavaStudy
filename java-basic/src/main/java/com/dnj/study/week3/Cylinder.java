package com.dnj.study.week3;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/19
 **/
public class Cylinder extends Circle {
    public int h;

    public Cylinder(int x,int y,int r,int h){
        super(x,y,r);
        this.h = h;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆柱体的体积:" + super.getArea() * this.h);
    }
}
