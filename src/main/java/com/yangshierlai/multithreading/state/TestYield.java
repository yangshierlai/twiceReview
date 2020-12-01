package com.yangshierlai.multithreading.state;

/**
 * @Author ren
 * @Date 2020/11/26 20:16
 *
 * 测试礼让线程
 * 礼让不一定成功，看cpu心情
 **/
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();

        new  Thread(myYield,"a").start();
        new  Thread(myYield,"b").start();
    }

}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println("线程开始执行"+Thread.currentThread().getName());
        //礼让
        Thread.yield();
        System.out.println("线程停止执行"+Thread.currentThread().getName());
    }
}