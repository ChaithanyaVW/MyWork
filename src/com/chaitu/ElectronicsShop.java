package com.hacker;

public class ElectronicsShop {

    public static void main(String[] args) {
        int[] keyboardsCost = {1,5,4};
        int[] drivesCost = {2,4};
        int b = 6;
        System.out.println( getMoneySpent(keyboardsCost,drivesCost,b));
    }

    private static int getMoneySpent(int[] keyboardsCost, int[] drivesCost, int b) {
        int result=0, previous_item=0;

        for(int x: keyboardsCost){
            for(int y: drivesCost){
                if(x<= previous_item) break;
                if(x+y<b && x +y > result) result = x+y;
            }
            previous_item= x;
        }
        if (result!=0)
            return result;
        return -1;

    }
}
