package com.yangshierlai.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description list
 * 遍历 ArrayList
 * @Author ren
 * @Date 2020/11/17 16:03
 * @Version
 **/
public class ListTest {

    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 46, 11, 66, 23, 56, 89};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);

        list.forEach((s)->{
            System.out.println(s);
        });

        /**
         //
         //  也可以改写 for(int i=0;i<list.size();i++) 这种形式
         */
        System.out.println("第一种遍历方法使用 For-Each 遍历 List");
        for (Integer onece : list) {
            System.out.print(onece + " ");
        }
        System.out.println();

        /**
         //
         */
        Integer[] intArray = new Integer[list.size()];
        list.toArray(intArray);

        System.out.println("第二种遍历，把链表变为数组相关的内容进行遍历");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "  ");
        }
        System.out.println();

        /**
         *    3. 迭代器
         */
        System.out.println("第 3. 迭代器");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}