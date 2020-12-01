package com.yangshierlai.multithreading.syn;

import java.util.ArrayList;

/**
 * @Author ren
 * @Date 2020/11/27 18:10
 **/
public class UnsafeList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }

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
