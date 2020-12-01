package com.yangshierlai.arithmetic;

/**
 * @Description
 *
    三元运算符:求两个数的最大值,判断两个数是否相等
    格式:
    (条件表达式) ? 表达式1 : 表达式2;
    执行流程:
    首先判断条件表达式是否成立
    true:表达式1作为3元运算符的结果
    false:表达式2作为3元运算符的结果
    注意：
    三元运算符，最终一定会产生一个结果值，这个值必须被使用起来。
    要么被运算符使用，要么被打印

 * @Author ren
 * @Date 2020/11/17 15:42
 * @Version
 **/
public class SanYuan {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int max = (a>b)?a : b;
        System.out.println(max);

        boolean bool = (a!=b)?true:false;
        System.out.println(bool);
    }
}