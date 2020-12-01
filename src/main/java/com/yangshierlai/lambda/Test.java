package com.yangshierlai.lambda;

import java.util.function.Consumer;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/19 22:43
 * @Version
 **/
 public  class Test {
   public static void buySth(int m, Consumer s){
       s.accept (m);
   }

    public static void main(String[] args) {
        buySth(4000,money-> System.out.println("这是"+money+"块钱"));
    }
}