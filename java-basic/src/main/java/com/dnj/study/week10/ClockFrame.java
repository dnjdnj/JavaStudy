package com.dnj.study.week10;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.*;

/**
 * @ClassName ClockFrame 时钟窗体
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/14
 **/
public class ClockFrame extends JFrame {
    private JLabel timeLabel;
    private JPanel timePanel;
    private TimerTask timerTask;
//    private Timer timer;

    public ClockFrame(){
        init();
        setTitle("闹钟窗体");
        setSize(new Dimension(500,400));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void init(){
        timeLabel = new JLabel();
        timePanel = new JPanel(){

            @Override
            protected void paintComponent(Graphics g) {
                //绘制背景图
                File file;
                try{
                    Image bg = ImageIO.read(new URL("https://dnj-javastudy.oss-cn-beijing.aliyuncs.com/student/b4.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        };
        Font font = new Font("微软雅黑",Font.BOLD,20);
        timeLabel.setFont(font);
        timePanel.setPreferredSize(new Dimension(300,200));
        timePanel.add(timeLabel);
        add(timePanel);
        //创建定时任务
        timerTask = new TimerTask() {
            @Override
            public void run() {
                //1.通过Date对象和SimpleDateFormat格式化时间
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                timeLabel.setText(timeString);
                //判断当前时间是否和预设时间相等
                if ("2020-12-14 14:31:00".equals(timeString)){
                    JOptionPane.showMessageDialog(timePanel,"第一个闹钟时间到了");
                }
                if("2020-12-14 14:31:30".equals(timeString)){
                    JOptionPane.showMessageDialog(timePanel,"第二个闹钟时间到了");
                    //任务全部执行完毕，取消周期性执行计划
                    this.cancel();
                }
            }
        };
//        //创建timer对象
//        timer = new Timer();
//        //按固定频率执行任务，延时为0，周期为1秒，执行timerTask
//        timer.scheduleAtFixedRate(timerTask,0,1000);
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
        pool.scheduleWithFixedDelay(timerTask, 0, 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        new ClockFrame();
    }
}
