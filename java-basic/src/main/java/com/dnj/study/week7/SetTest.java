package com.dnj.study.week7;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName Set接口测试
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
        System.out.println("TreeSet的例子");
        Student s1 = Student.builder().name("aaa").age(20).build();
        Student s2 = Student.builder().name("bbb").age(21).build();
        Student s3 = Student.builder().name("ccc").age(22).build();
        Set<Student> stuSet = new TreeSet<>();
        stuSet.add(s1);
        stuSet.add(s2);
        stuSet.add(s3);
        System.out.println(stuSet);

//
//        Set<String> set = new TreeSet<>();
//        set.add("C");
//        set.add("A");
//        set.add("B");
//        System.out.println(set);
//
//        //使用for循环遍历
//        System.out.println("用for循环随机遍历set");
//        for(String s:set){
//            System.out.print(s + " ");
//        }
//        System.out.println();
//        //使用iterator遍历
//        System.out.println("用iterator迭代器遍历set");
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
//        System.out.println();
//        //使用lambda遍历
//        System.out.println("使用lambda表达式遍历set");
//        set.forEach(s -> System.out.print(s +" "));
//        System.out.println();
//        System.out.println("使用lambda的方法应用遍历set");
//        set.forEach(System.out::println);
//
//
//        System.out.println("HashSet例子");
//        Set<String> hashSet = new HashSet<>();
//        hashSet.add("C");
//        hashSet.add("A");
//        hashSet.add("B");
//        //使用for循环遍历
//        System.out.println("使用for循环遍历");
//        Object[] array = set.toArray();
//        for(Object o : array){
//            System.out.print(o.toString() + " ");
//        }
//        System.out.println();
//        //使用iterator遍历
//        System.out.println("使用iterator遍历");
//        Iterator<String> iterator1 = hashSet.iterator();
//        while (iterator1.hasNext()){
//            System.out.print(iterator1.next() + " ");
//        }
//        System.out.println();
//        //使用lambda遍历
//        System.out.println("使用lambda表达式遍历hashSet");
//        hashSet.forEach(s -> System.out.print(s +" "));
//        System.out.println();
//        System.out.println("使用lambda的方法应用遍历hashSet");
//        hashSet.forEach(System.out::println);
    }
}
