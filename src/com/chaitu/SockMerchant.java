package com.chaitu;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    public int sockMerchant(int n, int[] input){
        Map<Integer, Integer> store= new HashMap<>();
        int result=0;
        for(int i=0; i<n; i++) {
            if (store.containsKey(input[i])) {
                if (store.get(input[i]) < 0) result++;
                store.put(input[i], -store.get(input[i]));
            }
            else{
                store.put(input[i],-1);
            }
        }
       return result;
    }

    public static void main(String[] args) {
        int[] input = {10 ,20 ,20 ,10 ,10 ,30 ,50,10,20,20,60};
        SockMerchant sockMerchant= new SockMerchant();
        System.out.println(sockMerchant.sockMerchant(input.length, input));
    }
}
