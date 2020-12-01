package com.yangshierlai.multithreading.lock;

/**
 * @Author ren
 * 2020/11/27 18:50
 * 死锁： 多个线程抱着对方需要的资源，然后形成僵持
 **/
public class DeadLock {

    public static void main(String[] args) {
        MakeUp g1 = new MakeUp(0, "灰姑娘");
        MakeUp g2 = new MakeUp(1, "白雪公主");
        g1.start();
        g2.start();
    }
}

//口红
class Lipstick {

}

//镜子
class Mirror {

}

class MakeUp extends Thread {
    //需要的资源只有一份， 用static保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;//选择
    String girlName;//使用化妆品的人

    MakeUp(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        try {
            makeUp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //化妆，互相持有对方的锁，就是需要拿到对方的资源
    private void makeUp() throws InterruptedException {
        if (choice == 0) {
            //获得口红锁
            synchronized (lipstick) {
                System.out.println(this.girlName + "获得了口红锁");
                Thread.sleep(1000);
                //一秒钟后获得镜子锁
            }
            synchronized (mirror) {
                System.out.println(this.girlName + "获得了镜子锁");
            }

        } else {
            synchronized (mirror) {
                System.out.println(this.girlName + "获得了镜子锁");
                Thread.sleep(2000);
                //一秒钟后获得口红锁
            }
            synchronized (lipstick) {
                System.out.println(this.girlName + "获得了口红锁");
            }
        }
    }
}
