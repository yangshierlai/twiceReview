package com.yangshierlai.juc;


import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author ren
 * @Date 2020/11/27 18:44
 * juc 并发包下的list
 **/
public class TestList {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }

}
