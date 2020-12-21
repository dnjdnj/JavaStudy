package com.dnj.study.week9;

/**
 * @ClassName TestSafe
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/7
 **/
public class TestThread extends Thread{

    private static int num = 20;
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (num > 0){
            try{
                System.out.println("当前售票窗口：" + name + ",剩余票数：" + num--);
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
