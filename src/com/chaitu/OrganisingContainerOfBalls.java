package com.chaitu;

import java.util.*;

public class OrganisingContainerOfBalls {

    public static void main(String[] args) {
        int[][] container = new int[2][2];
        //Arrays.fill(container, 1);
        container[0][0] = 999336263;
        container[0][1] = 998799923;
        container[1][0] = 998799923 ;
        container[1][1] = 999763019;
        System.out.println(organizingContainers(container));
    }

    static String organizingContainers(int[][] container) {
        int length = container.length, tempSum = 0, tempsum1=0;
        List<Integer> sumOfBalls= new ArrayList();
        List<Integer> ballsInContainer= new ArrayList();
        for(int i =0; i<length; i++ ){
            tempSum=0; tempsum1=0;
            for(int j=0; j<length ; j++){
                tempSum +=container[j][i];
                tempsum1 += container[i][j];}

            ballsInContainer.add(tempsum1);
            sumOfBalls.add(tempSum);
        }
        Collections.sort(sumOfBalls);
        Collections.sort(ballsInContainer);
        if(sumOfBalls.equals(ballsInContainer)) return "Possible";
        return "Impossible";

    }
}
