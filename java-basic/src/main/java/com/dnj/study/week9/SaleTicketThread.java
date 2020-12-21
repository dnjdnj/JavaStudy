package com.dnj.study.week9;

/**
 * @ClassName Safes
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/7
 **/
public class SaleTicketThread implements Runnable{
    public static int tickets = 10;
    public static int THREAD_NUM = 3;
    private final Object obj = new Object();


    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName()+"正在卖出第"+tickets+"张票");
                    tickets--;
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        SaleTicketThread task = new SaleTicketThread();
        Thread t1 = new Thread(task);
        t1.setName("窗口1");
        t1.start();
        Thread t2= new Thread(task);
        t2.setName("窗口2");
        t2.start();
        Thread t3 = new Thread(task);
        t3.setName("窗口3");
        t3.start();
    }
}
