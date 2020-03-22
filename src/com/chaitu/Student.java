package com.chaitu;

import javax.swing.table.TableStringConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import static java.lang.StrictMath.abs;

public class Student {

    public static void main(String[] args) {
        Vector<Vector<Integer>> arr = new Vector<Vector<Integer>>( );
        List<List<Integer>> list= new ArrayList<List<Integer>>(2);
        list.set(0, Arrays.asList(1,2));
        Vector<Integer> dummy= new Vector<Integer>(); List<Integer> l1 = new ArrayList<>();
        for(int i=0; i<3; i++){
            dummy.clear();
            for(int j=0; j<3; j++){
             dummy.add(i+j);
            }
            arr.add(i,dummy);
            //System.out.println(dummy);
        }

        int difference=0;

        for(int i=0; i< arr.size();i++){
            difference+= arr.get(i).get(i);
        }
        System.out.println(difference);
        int j=0;
        for(int i=arr.size()-1; i>=0;i--){
            difference= difference - arr.get(i).get(j);
            System.out.println(difference);
            j++;
        }
        abs(difference);
        //return difference;
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(0).size());
        System.out.println(difference);


//        List<Integer> a =new ArrayList(3);
//        List<Integer> b = new ArrayList(3);
//        a.add(5);
//        a.add(6);
//        a.add(7);
//        b.add(3);
//        b.add(6);
//        b.add(10);
//        //vector.addAll(a);
//        List<Integer> result = new ArrayList(2);
//        result.add(0);
//        result.add(0);

        //int a1=0,b1=0;

//        for(int i =0; i<3; i++){
//            if(a.get(i)>b.get(i)){
//                System.out.println(result.size());
//                 result.add(0,1);
//                System.out.println(result.size());}
//            else if(a.get(i)<b.get(i)){
//                result.add(1,result.get(1)+1);
//            }


      //  }


    }
    }

