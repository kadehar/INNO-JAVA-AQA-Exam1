package com.github.kadehar.inno.exam1.task3;

import java.util.Arrays;

public class SecondMaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 2, 0, 4, 9, 6};
        System.out.println("firstWay answer = " + firstWay(arr));
        System.out.println("secondWay answer = " + secondWay(arr));
    }

    private static int firstWay(int[] array) {
        int[] arrCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrCopy);
        return arrCopy[arrCopy.length - 2];
    }

    private static int secondWay(int[] array) {
        int[] arrCopy = Arrays.copyOf(array, array.length);
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arrCopy) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }
}
