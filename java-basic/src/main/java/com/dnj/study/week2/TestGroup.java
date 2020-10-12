package com.dnj.study.week2;

import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName testGroup
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/12
 **/
public class TestGroup {

    public static void main(String[] args) {

        Book book1 = new Book("java基础",70,new Date());
        Book book2 = new Book("javascript",80,new Date());
        Book book3 = new Book("java从零",90,new Date());
        Book book4 = new Book("java大神",75,new Date());
        Book book5 = new Book("java应用",100,new Date());

        Phone phone1 = new Phone("小米",5000);
        Phone phone2 = new Phone("华为",6000);
        Phone phone3 = new Phone("苹果",7000);

        Student student1 = new Student("1001","张三","男",phone1,new Book[]{book1,book2});
        Student student2 = new Student("1002","李四","女",phone2,new Book[]{book1,book2,book3});
        Student student3 = new Student("1003","王五","男",phone3,new Book[]{book4,book5});

        Group group1 = new Group("第一组",new Student[]{student1,student2});
        Group group2 = new Group("第二组",new Student[]{student3});
        System.out.println(Arrays.toString(group1.getStudents()));


    }
}
