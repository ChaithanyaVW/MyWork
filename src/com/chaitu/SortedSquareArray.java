package com.chaitu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedSquareArray {

    public static void main(String[] args) {
        int[] input = {-5,7,3,-2,4};
        Arrays.stream(input).map(x -> x*x).sorted().forEach(x -> System.out.println(x));
    }
}
