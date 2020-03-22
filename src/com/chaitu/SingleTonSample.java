package com.chaitu;

public class SingleTonSample {
    public static SingleTonSample singleTonInstance ;
    int temp;

    private SingleTonSample() {
        System.out.println("Instance========================");
    }

    public static SingleTonSample getInstance(){
            if(singleTonInstance==null)
            singleTonInstance = new SingleTonSample();
        return singleTonInstance;
    }
    public int getTemp() {
        return temp;
    }
}
