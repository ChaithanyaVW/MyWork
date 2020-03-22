package com.chaitu;

import org.w3c.dom.ls.LSOutput;

public class FunctionalInterface {

    interface function{
        double multiply(int a, int b);
    }

    public static void main(String[] args) {
      function f1 = (int a, int b) -> {
           System.out.println("jDFVJBgkJe");
           return a*b;
      };
    f1.multiply(2,3);


    }


}
