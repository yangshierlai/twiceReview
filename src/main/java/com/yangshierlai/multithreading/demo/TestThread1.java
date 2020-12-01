package com.yangshierlai.multithreading.demo;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/23 17:47
 * @Version
 **/
public class TestThread1 extends Thread{


    @Override
    public void run() {
        for (int i =0 ; i<=10;i++){
            System.out.println(i+"thread");
        }
    }

    public static void main(String[] args) {

        TestThread1 testThread1 = new TestThread1();

        testThread1.start();


    }
}
