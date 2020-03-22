package com.hacker;

import java.util.Arrays;

public class CommonChild {

    public static void main(String[] args) {
        String s2 = "abcdefg";
        String s3 = "cdefgab";
        findMaxCommonChild(s2, s3);
    }

    private static void findMaxCommonChild(String s2, String s3) {
        StringBuilder[] result= new StringBuilder[2];
        int prevIndex =0, iterator=0;

        if(s2.equals(s3)) {
            System.out.println("============Two Strings are Equal so longest substring is String is itself==============");
        }

        else{
        for(int i=0; i<iterator; i++){

            while(iterator!=s3.length()){
                if(s2.charAt(i)==s3.charAt(iterator)&& iterator==prevIndex+1){
                    prevIndex= iterator;
                    result[0].append(s2.charAt(i));
                }
                iterator++;
            }
            iterator = 0;
        }
        }
    }
}
