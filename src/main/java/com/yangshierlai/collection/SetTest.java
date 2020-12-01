package com.yangshierlai.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/17 16:03
 * @Version
 **/
public class SetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");

        System.out.println(hashSet);

        System.out.println("1: 迭代器");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("2. 增强for循环");
        for (String s :hashSet){
            System.out.println(s);
        }

        System.out.println("3. foreach");
        hashSet.forEach((str)->{
            System.out.println(str);
        });

    }
}