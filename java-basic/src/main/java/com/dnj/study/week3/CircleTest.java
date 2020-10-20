package com.dnj.study.week3;

/**
 * @ClassName CircleTest
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/19
 **/
public class CircleTest {
    public static void main(String[] args) {
        Point point = new Point(10,20);
        System.out.println("***********");
        Circle circle = new Circle(10,20,5);
        System.out.println("***********");
        Cylinder cylinder = new Cylinder(10,10,5,6);
        System.out.println("***********");
        point.print();
        System.out.println("***********");
        circle.print();
        System.out.println("***********");
        cylinder.print();
    }
}
