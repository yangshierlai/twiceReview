package com.yangshierlai.arithmetic;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/7 16:50
 * @Version
 **/
public class Singleton {

    private Singleton() {
    }

    private static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        System.out.println("调用成功");
        return singleton;
    }
}