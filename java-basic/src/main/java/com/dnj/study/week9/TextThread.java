package com.dnj.study.week9;

import lombok.SneakyThrows;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @ClassName TextThread
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/7
 **/
public class TextThread implements Runnable {
    private JLabel textLabel;
    private String[] str = {"txt1","txt2","txt3","txt4","txt5","txt6"};
    public void setTextLabel(JLabel textLabel){
        this.textLabel = textLabel;
    }

    @SneakyThrows
    @Override
    public void run() {
        int index = 0;
        int len = str.length;
        while (true){
            try {
                File file = new File("C:\\Users\\dnj\\Desktop\\oss\\textFile\\"+str[index]+".txt");
                FileReader fre=new FileReader(file);
                BufferedReader bre=new BufferedReader(fre);
                String str="";
                while((str=bre.readLine())!=null)
                {
                    textLabel.setText(str);
                }
                bre.close();
                fre.close();
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            index++;
            //处理数组最后一个元素
            if(index ==len){
                index = 0;
            }
        }

    }
}
