package com.yangshierlai.multithreading.state;

/**
 * @Author ren
 * @Date 2020/11/26 20:28
 *
 *  测试join方法，合并线程  想象为插队
 **/
public class TestJoin extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <=1000; i++) {
            System.out.println("线程vip"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        testJoin.start();

        for (int i = 0; i <= 500; i++) {
            if (i==200){
                testJoin.join();
            }
            System.out.println("main --"+i);
        }
    }
}
