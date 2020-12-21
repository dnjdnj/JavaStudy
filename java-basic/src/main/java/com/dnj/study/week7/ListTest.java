package com.dnj.study.week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @ClassName List接口测试程序
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        //创建一个list接口的实现类的对象，泛型为string
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("java");
        list.add("javascript");
        list.add("java");

        //随机取出list中某个元素
        System.out.println("随机取出list中某个元素");
        Random random = new Random();
        int count = random.nextInt(list.size());
        System.out.println(list.get(count));
        //用for循环遍历list
        System.out.println("用for循环随机遍历list");
        for(String s:list){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("用iterator迭代器遍历list");
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("使用lambda表达式遍历list");
        list.forEach(s -> System.out.print(s +" "));
        System.out.println();
        System.out.println("使用lambda的方法应用遍历list");
        list.forEach(System.out::println);
    }
}
