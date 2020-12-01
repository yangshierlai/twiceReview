package com.yangshierlai.lambda;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/19 21:36
 * @Version
 **/
public interface MyInteface2 {
    void test2(int a);
}

class Demo2{
    public static void main(String[] args) {

        MyInteface2 m = a -> System.out.println("一个参数表达式 ,  无返回值"+a);
        m.test2(10);
    }
}