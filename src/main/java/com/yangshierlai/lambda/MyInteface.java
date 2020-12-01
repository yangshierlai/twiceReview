package com.yangshierlai.lambda;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/19 21:36
 * @Version
 **/
public interface MyInteface {
    void test();
}

class Demo{
    public static void main(String[] args) {
        MyInteface m = ()-> System.out.println("无参数表达式， 无返回值");
        m.test();
    }
}