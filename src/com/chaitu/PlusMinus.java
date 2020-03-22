package com.chaitu;



import java.util.*;
import java.util.stream.Collectors;

public class PlusMinus {

    public static void main(String[] args) {
        int[] ar ={18,90,90,13,90,75,90,8,90,43};
        int[] arr = new int[5] ;
        arr[0]=1;
        System.out.println(arr[1]);
        List<Integer> check= new ArrayList<>();
        check.add(90);
        List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());

        list.retainAll(check);
        System.out.println(list);
        int swap=0;
        for(int i=0; i<ar.length-1;i++){
            if(ar[i]>ar[i+1]){
                swap=  ar[i];
                ar[i]=  ar[i+1];
                ar[i+1]= swap;
            }
        }
        int count=0;
        for(int i= ar.length-1; i>=0;i--){
            if(ar[i]==ar[ar.length-1])
                count++;
            else if(ar[i]!=ar[ar.length-1])
                break;
        }

        System.out.println(count);
    }
}
