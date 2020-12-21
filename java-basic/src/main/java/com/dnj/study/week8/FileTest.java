package com.dnj.study.week8;

import java.io.File;
import java.time.LocalDate;

/**
 * @ClassName FileTest
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
        //创建文件
//        File file = new File("C:\\Users\\dnj\\Desktop\\1.txt");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());

        //创建文件夹

//        File dir = new File("C:\\Users\\dnj\\Desktop\\hello" );
//        if(!dir.exists()){
//            boolean flag = dir.mkdir();
//            System.out.println(flag);
//
//        }

        //test1 创建目录，使用当前系统日期命名 然后删除这个目录

//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String dateName = sdf.format(date);

        LocalDate today = LocalDate.now();
        String dateName = today.getYear() + "-" + today.getMonthValue() +"-" + today.getDayOfMonth();
        File dateDir = new File("C:\\Users\\dnj\\Desktop\\" + dateName);
        if(!dateDir.exists()){
            boolean flag = dateDir.mkdir();
            System.out.println("创建文件夹"+flag);
        }


        if(dateDir.exists()){

            boolean flag = dateDir.delete();
            System.out.println("删除文件夹"+flag);
        }


        //test2 递归创建目录 顶级目录名：Java 一级目录名：面向对象、异常、集合、io、多线程，io下目录：字节流、字符流
        File file1 = new File("C:\\Users\\dnj\\Desktop\\Java\\面向对象");
        File file2 = new File("C:\\Users\\dnj\\Desktop\\Java\\异常");
        File file3 = new File("C:\\Users\\dnj\\Desktop\\Java\\集合");
        File file4 = new File("C:\\Users\\dnj\\Desktop\\Java\\io\\字节流");
        File file5 = new File("C:\\Users\\dnj\\Desktop\\Java\\io\\字符流");
        File file6 = new File("C:\\Users\\dnj\\Desktop\\Java\\多线程");
        System.out.println("创建文件夹" + file1.getName()+create(file1));
        System.out.println("创建文件夹" + file2.getName()+create(file2));
        System.out.println("创建文件夹" + file3.getName()+create(file3));
        System.out.println("创建文件夹" + file4.getName()+create(file4));
        System.out.println("创建文件夹" + file5.getName()+create(file5));
        System.out.println("创建文件夹" + file6.getName()+create(file6));

    }

    public static boolean create(File file) {
        if (file.getParentFile().exists()) {
            return  file.mkdir();
        } else {
            create(file.getParentFile());
            return file.mkdir();
        }

    }
}
