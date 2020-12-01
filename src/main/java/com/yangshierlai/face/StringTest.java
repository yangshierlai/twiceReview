package com.yangshierlai.face;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description   截取字符串
 * @Author ren
 * @Date 2020/11/16 16:38
 * @Version
 **/
public class StringTest {
    public static void main(String[] args) {
        String s ="IDEA+MAVEN+GIT";

        /**
         * 第一种  string。substring
         */
        System.out.println(s.substring(0,4));

        /**
         * 第二种  split  + 正则表达式
         * 将正则传入split()。返回的是一个字符串数组类型。不过通过这种方式截取会有很大的性能损耗，因为分析正则非常耗时。
         */




        /**
         * 第三种   stringutils 提供的方法
         */

        String s1 = StringUtils.substringBefore(s, "+");
        System.out.println(s1);
    }
}