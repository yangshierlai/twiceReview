package com.yangshierlai.arithmetic;

import java.util.Arrays;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/6 15:26
 * @Version
 **/
public class Bubbling {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,22,11,50,65,20,13};

        System.out.println(Arrays.toString(bubbleSort(arr1)));

    }

}