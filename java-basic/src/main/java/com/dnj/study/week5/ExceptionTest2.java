package com.dnj.study.week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ExceptionTest2
 * @Description 编译时异常练习
 * @Author dnj
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) {
        //在方法调用处捕获异常，这样做的好处是：即使出现异常，也不会影响其他代码段的运行
        try {
            byte[] b = readFile("C:\\Users\\dnj\\Desktop\\JSwork.docx");
            System.out.println(b.length);
        } catch (IOException e) {
            System.err.println("出现IO异常");
        }finally {//常常用于数据库连接的关闭，线程池资源回收，IO流的关闭等
            System.out.println("无论有无异常都会执行的代码段！");
        }

        System.out.println("其他代码");

    }


    /**
     * 用throws关键字在方法签名处生命异常
     * @param path 文件路径
     * @return b：字节数组
     * @throws IOException
     */
    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        is.close();
        return b;
    }
}
