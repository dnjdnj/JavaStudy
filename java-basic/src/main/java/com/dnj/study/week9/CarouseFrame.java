package com.dnj.study.week9;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName CarouseFrame
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/7
 **/
public class CarouseFrame extends JFrame {
    private JLabel bglabel;
    private JLabel timeLabel;
    private JLabel textLabel;
    public CarouseFrame(){
        init();
        setTitle("carouse frame");
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init(){
        bglabel = new JLabel();
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bglabel);
        new Thread(ct).start();
        this.getContentPane().add(bglabel, BorderLayout.CENTER);
        //时间线程和标签
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("微软雅黑",Font.BOLD,20));
        this.getContentPane().add(timeLabel,BorderLayout.SOUTH);
        TimeThread tt = new TimeThread();
        tt.setTimeLabel(timeLabel);
        new Thread(tt).start();
        //文本
        textLabel = new JLabel();
        textLabel.setFont(new Font("微软雅黑",Font.BOLD,20));
        this.getContentPane().add(textLabel,BorderLayout.NORTH);
        TextThread tt1 = new TextThread();
        tt1.setTextLabel(textLabel);
        new Thread(tt1).start();
    }

    public static void main(String[] args) {
        new CarouseFrame();

    }
}
