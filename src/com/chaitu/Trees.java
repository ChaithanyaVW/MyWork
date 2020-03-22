package com.chaitu;

import java.util.*;

public class Trees {

    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1,"Chaitanya");
        hashmap.put(1,"Chaitanya");
        hashmap.put(45,"Akhil");
        hashmap.put(3,"Ram");
        hashmap.put(2,"Ram");

     hashmap.forEach( (k,v) -> System.out.println(v) );
        for (Map.Entry<Integer,String> entry : hashmap.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
        for(int i =0; i<3; i++){
            hashmap.get(i);
        }
        System.out.println(hashmap);
    }
}
