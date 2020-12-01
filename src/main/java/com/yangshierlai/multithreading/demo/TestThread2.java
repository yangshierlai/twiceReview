package com.yangshierlai.multithreading.demo;

/**
 * @Author ren
 * @Date 2020/11/25 20:02
 **/
public class TestThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i ++) {
            System.out.println("我在看代码" + i);
        }
    }

    public static void main(String[] args) {
        TestThread2 testThread2 = new TestThread2();
        new Thread(testThread2).start();

        for (int i = 0; i <= 200; i ++) {
            System.out.println("我在学习代码" + i);
        }

    }

}
