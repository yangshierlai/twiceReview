package com.yangshierlai.arithmetic;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/6 16:40
 * @Version
 **/
public class Binary {

    public static void main(String[] args) {
        //定义数组
        int[] a = new int[]{1, 3, 5, 7, 9, 11, 19, 21, 25};
        //定义要查找的数
        int num = 21;
        //查找这个数
        int i = binarySearch(a, 0, a.length - 1, num);
        if (i >= 0) {
            System.out.println(num + "值在数组中对应的下标：" + i);
        } else {
            System.out.println("该数不存在！");
        }
    }

    /**
     * @param a    数组
     * @param low  最小下标
     * @param high 最大下标
     * @param k    要查找的数
     * @return
     */
    public static int binarySearch(int[] a, int low, int high, int k) {
        //中间值
        int mid;
        if (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == k) {
                return mid;
            }
            if (a[mid] > k) {
                return binarySearch(a, low, mid - 1, k);
            } else {
                return binarySearch(a, mid + 1, high, k);
            }
        } else {
            return -1;
        }
    }


    public static int BinSearch(int[] a, int low, int high, int k) {
        //中间值
        int mid;
        if (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == k) {
                //如果中间值等于k，查找结束，返回mid
                return mid;
            }
            if (a[mid] > k) {
                //如果a[mid]大于k，查找左区间
                return BinSearch(a, low, mid - 1, k);
            } else {
                //如果a[mid]小于k，查找右区间
                return BinSearch(a, mid + 1, high, k);
            }
        } else {
            return -1;
        }
    }

//    public static int binarySearch(int[] srcArray, int des) {
//        //定义初始最小、最大索引
//        int start = 0;
//        int end = srcArray.length - 1;
//        //确保不会出现重复查找，越界
//        while (start <= end) {
//            //计算出中间索引值
//            int middle = (end + start)>>>1 ;//防止溢出
//            if (des == srcArray[middle]) {
//                return middle;
//                //判断下限
//            } else if (des < srcArray[middle]) {
//                end = middle - 1;
//                //判断上限
//            } else {
//                start = middle + 1;
//            }
//        }
//        //若没有，则返回-1
//        return -1;
//    }
//
//
//
//    public static void main(String[] args) {
//        int arr[]={1,5,8,11,6,9,15,35,456,65};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(Bubbling.bubbleSort(arr)));
//        System.out.println(binarySearch(arr,11));
//
//    }

}