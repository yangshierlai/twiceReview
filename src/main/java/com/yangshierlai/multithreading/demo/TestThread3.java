package com.yangshierlai.multithreading.demo;

/**
 * @Author ren
 * @Date 2020/11/25 21:25
 *
 *  多个线程操操纵同一个对象
 *   买火车票的例子
 *
 *   模拟网络延迟，放大问题的发生性
 **/
public class TestThread3 implements Runnable {

    int ticketNums = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNums<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"买到第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        TestThread3 t = new TestThread3();

        new Thread(t,"小明").start();
        new Thread(t,"小红").start();
        new Thread(t,"小军").start();

    }
}
