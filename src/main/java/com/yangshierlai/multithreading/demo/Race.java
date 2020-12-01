package com.yangshierlai.multithreading.demo;

/**
 * @Author ren
 * @Date 2020/11/26 16:57
 * 模拟龟兔赛跑
 **/
public class Race implements Runnable {

    private static String winner;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //判断比赛是否结束
            boolean flag = gameOver(i);
            //如果结束  停止程序
            if (flag) {
                break;
            }

            System.out.println(Thread.currentThread().getName() + "-->跑了 " + i + "步");
        }
    }

    //判断是否完成比赛
    public boolean gameOver(int steps) {

        //判断是否有胜利者
        if (winner != null) {
            return true;
        }
        {
            if (steps == 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is" + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();

    }

}
