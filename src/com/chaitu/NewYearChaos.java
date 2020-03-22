package com.chaitu;

import java.util.Arrays;

import static java.lang.StrictMath.abs;

public class NewYearChaos {

    public static void main(String[] args) {
        int[] q = {2,1,5,3,4};
        minimumBribes(q);
    }

    private static void minimumBribes(int[] q) {
        int[] sortedArray = Arrays.stream(q).sorted().toArray();
        boolean flag = true;
       for(int i=0; i<q.length; i++){
           if(abs(getIndex(sortedArray,q[i])-i)>2){
               System.out.println("Too Chaotic");
               flag= false;
               break;}
       }
       if(flag){
           System.out.println(  "possible");
       }
    }

    private static int getIndex(int[] sortedArray, int i) {
        for(int j=0; j< sortedArray.length; j++){
            if(sortedArray[j]==i){
                return j;
            }
        }
        return 0;
    }
}
