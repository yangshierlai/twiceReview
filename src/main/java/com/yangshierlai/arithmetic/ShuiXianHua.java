package com.yangshierlai.arithmetic;

/**
 * @Description  水仙花数
 * @Author ren
 * @Date 2020/11/12 21:52
 * @Version
 **/
public class ShuiXianHua {
    public static void main(String[] args) {
        for (int i = 100;i<1000;i++){
            int first = i/100;
            int second = i/10%10;
            int third = i%10;

            if (first*first*first+second*second*second+third*third*third==i){
                System.out.println("水仙花数为："+i);
            }
        }
        int i[] = new int[10];
    }
}