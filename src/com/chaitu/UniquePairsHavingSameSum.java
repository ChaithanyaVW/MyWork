package com.chaitu;

import java.util.ArrayList;
import java.util.List;

public class UniquePairsHavingSameSum {


    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 1,3, 3, 5, 6, 5};
        int sum = 6;
        try {
            getPairs(arr, sum);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    private static void getPairs(int[] arr, int sum) {
        if (arr.length == 0) throw new NullPointerException("Found Array is empty please send a valid Array");
        List<Integer> store = new ArrayList<>();
        boolean flag = false;
        int arraySize = arr.length;
        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if ( store.contains(i)||store.contains(j)) break;
                if (arr[i] + arr[j] == sum) {
                    store.add(j);
                    store.add(i);
                    flag = true;
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");
                    break;
                }
            }
        }
        if (!flag)
            System.out.println("No pairs found");
    }
}
