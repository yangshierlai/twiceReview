package com.yangshierlai.multithreading.syn;

/**
 * @Author ren
 * @Date 2020/11/27 17:45
 *
 * 不安全的买票
 *  线程不安全，有负数
 **/
public class UnSafeBuyTicket {

    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station,"黄牛").start();
        new Thread(station,"小明").start();
        new Thread(station,"小红").start();
    }

}

class BuyTicket implements Runnable {

    private int ticketNums = 10;
    //外部停止方法
    boolean flag = true;

    @Override
    public void run() {
        //买票
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNums <= 0) {
            System.exit(0);
        }

        //模拟延时
        Thread.sleep(100);

        //买票
        System.out.println(Thread.currentThread().getName() + "买到了" + ticketNums--);
    }
}
