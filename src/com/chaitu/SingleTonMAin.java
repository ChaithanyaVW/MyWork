package com.chaitu;

public class SingleTonMAin {
    public static void main(String[] args) {
        SingleTonSample singleTonSample =  SingleTonSample.getInstance();
        SingleTonSample singleTonSample1 =  SingleTonSample.getInstance();
        System.out.println(singleTonSample + "========================"+ singleTonSample1);
        System.out.println(SingleTonSample.singleTonInstance.getTemp());
        System.out.println(singleTonSample.getTemp());
    }
}
