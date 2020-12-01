package com.yangshierlai.multithreading.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author ren
 * @Date 2020/11/27 19:32
 * <p>
 * lock 锁
 **/
public class TestReentrantLock {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket).start();
        new Thread(buyTicket).start();
        new Thread(buyTicket).start();

    }

}

class BuyTicket implements Runnable {

    int ticketNums = 10;
    //定义lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticketNums > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticketNums--);

                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
