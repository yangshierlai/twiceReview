package com.yangshierlai.lambda;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/19 21:36
 * @Version
 **/
public interface MyInteface3 {
    int test(int a,int b);
}

class Demo3{
    public static void main(String[] args) {

        MyInteface3 m = (a,b) ->{
            System.out.println("多个参数表达式 ,  有返回值 ， 第一句话 " + a);
            System.out.println("多个参数表达式 ,  有返回值 ， 第二句话 " + b);
            return a;
        };
        m.test(10,20);
    }
}