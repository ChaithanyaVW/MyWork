package com.chaitu;

import java.util.*;
import java.util.stream.Collectors;

public class HackerTest {

    public static void main(String[] args) {
        int year = 2015;
        int month= 8;
        List l1 = new ArrayList(2);
        l1.add(0,1);
        String s1 ="Hello";
        //Student st1 = new Student(12,s1);
        StringBuilder s2 = new StringBuilder("Hello");
        String s3 = s1.concat(" World");
        s2.append(" World");
        //System.out.println(st1);
       // System.out.println(s2 + "  ---------------------------"+s3);
        int day1= 5;

//        Date date= new Date(year,month-1,day1-1);
//        Calendar c= Calendar.getInstance();
//        c.setTime(date);
//
//        System.out.println( getDate(c.get(Calendar.DAY_OF_WEEK)-1));

    }

    private static String  getDate(int day) {
        Map<Integer, String> daysMap = new HashMap<>() ;
        daysMap.put(01,"Monday");
        daysMap.put(02,"Tuesday");
        daysMap.put(03,"Wednesday");
        daysMap.put(04,"Thursday");
        daysMap.put(05,"Friday");
        daysMap.put(06,"Saturday");
        daysMap.put(00,"Sunday");

      List<String> StringList = new ArrayList<>(3);
      StringList.add("tuesday");
      StringList.stream().filter(x -> x.equals("tuesday")).collect(Collectors.toList());
        System.out.println(StringList   );
        return daysMap.get(day);
    }


}
