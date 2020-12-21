package com.dnj.study.week9;

/**
 * @ClassName Safe
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/7
 **/
public class ThreadMain {
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        tt.setName("窗口1");
        tt.start();
        TestThread tt1 = new TestThread();
        tt1.setName("窗口2");
        tt1.start();
        TestThread tt2 = new TestThread();
        tt2.setName("窗口3");
        tt2.start();


    }
}
