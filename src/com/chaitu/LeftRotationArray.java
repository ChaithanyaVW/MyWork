package com.chaitu;

import java.util.Scanner;

public class LeftRotationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        scanner.close();

        for(int i=0; i<d;i++){
            order(a);
        }
        for(int i : a){
        System.out.print(i+" ");}
    }

    private static void order(int[] a) {
        int replace = a[0], size =a.length;

        for(int i=0; i<size -1 ;i++ ){
            a[i]=a[i+1];
        }
        a[size-1] = replace;
    }
}
