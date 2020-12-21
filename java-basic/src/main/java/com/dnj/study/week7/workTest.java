package com.dnj.study.week7;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName workTest
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/16
 **/
public class workTest {
    public static void main(String[] args) {
        Map<String,String> teacherWork = new HashMap<>();
        teacherWork.put("Tom","CoreJave");
        teacherWork.put("John","Oracle");
        teacherWork.put("Susan","Oracle");
        teacherWork.put("Jerry","JDBC");
        teacherWork.put("Jim","Unix");
        teacherWork.put("Kevin","JSP");
        teacherWork.put("Lucy","JSP");

        teacherWork.put("Allen","JDBC");

        teacherWork.replace("Lucy","CoreJava");

        System.out.println("==========================");
        System.out.println("通过遍历map的entrySet，遍历key和value");
        for(Map.Entry<String,String> entry : teacherWork.entrySet()){
            System.out.println(entry.getKey() + "教:" + entry.getValue());
        }

        System.out.println("==========================");
        System.out.println("lambda表达式遍历");
        teacherWork.forEach((key,value) -> System.out.println(  key +"教:" + value));
        System.out.println("==========================");
        System.out.print("教JDBC的老师有：");
        for(String key:teacherWork.keySet()){
            String course = teacherWork.get(key);
            if(course.equals("JDBC")){
                System.out.print(key + " ");
            }
        }
    }
}
