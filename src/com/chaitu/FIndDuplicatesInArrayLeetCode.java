package com.chaitu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndDuplicatesInArrayLeetCode {
    public List<Integer> solution(int[] input){
      List<Integer> result = new ArrayList<>();
        Arrays.sort(input);

      for(int i=0; i < input.length; i++){
          if(i+1==input.length)break;
          if (input[i] == input[i+1]) {
              result.add(input[i]);
          }
      }

      return result;
    }


    public static void main(String[] args) {

        int[] input= {1,2,3,4,7,8,1,23,4,2,3};
        FIndDuplicatesInArrayLeetCode fIndDuplicatesInArrayLeetCode= new FIndDuplicatesInArrayLeetCode();
        System.out.println(fIndDuplicatesInArrayLeetCode.solution(input));
    }
}
