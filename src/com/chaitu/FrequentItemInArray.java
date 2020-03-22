package com.chaitu;

import java.util.*;

public class FrequentItemInArray {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(3);
        array.add(4);
        array.add(4);
        array.add(4);
        array.add(55);
        List<Integer> list = new ArrayList<>();
        try {
            getFrequentItem(array);
        } catch (NullPointerException e) {
            System.out.println(new NullPointerException("Array is Empty========================= Please send a Valid Array"));
        }

    }

    private static void getFrequentItem(List<Integer> array) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        int highCount = 0, currentCount = 0;

        if (array.size() == 0) throw new NullPointerException();
        for (int i = 0; i < array.size(); i++) {
            currentCount = 1;
            int item = array.get(i);
            for (int j = i + 1; j < array.size(); j++) {
                if (item == array.get(j)) {
                    currentCount++;
                }
            }
            if (currentCount > highCount) {
                highCount = currentCount;
                result.clear();
                result.add(0, item);
            } else if (currentCount == highCount) {
                result.add(index, item);
                index++;
            }
        }
        System.out.println(result);
    }
}