package com.yangshierlai.multithreading.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author ren
 * @Date 2020/11/26 19:59
 * <p>
 * 模拟倒计时
 **/
public class TestSleep {

    public static void main(String[] args) {
        nowTime();

    }


    public static void nowTime() {
        //获取系统当前时间
        Date date = new Date(System.currentTimeMillis());

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <= 0) {
                break;
            }
        }
    }
}
