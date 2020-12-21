package com.dnj.study.week9;


import java.util.concurrent.Callable;

/**
 * @ClassName CallableSaleTicket
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/7
 **/
public class CallableSaleTicket implements Callable<Integer> {
    private Ticket tickets;

    public CallableSaleTicket(Ticket tickets){
        this.tickets = tickets;
    }


    @Override
    public Integer call(){
        while(true){
            synchronized (tickets) {
                int currentNo = tickets.getNum();
                if(currentNo>0){
                    System.out.println(Thread.currentThread().getName() + "准备出票,剩余票数:" + currentNo + "张");
                    --currentNo;
                    tickets.setNum(currentNo);
                    System.out.println(Thread.currentThread().getName() + "卖出一张,剩余票数:" + currentNo + "张");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName() + "余票不足,停止售票!");
                    break;
                }
            }
        }
        return null;
    }

    class Ticket{
        private int num;
        public Ticket(int n){
            this.num = n;
        }
        public void setNum(int n){
            this.num = n;
        }
        public int getNum(){
            return num;
        }
    }
}
