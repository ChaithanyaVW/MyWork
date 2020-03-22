package com.chaitu;

public class LongestPalindromeSubstring {

   int  finalLength=0, startPoint=0;
   public String longestPalindromeSubstring(String string){
       for(int i =0; i< string.length(); i++){
           checkPalindrome(string,i,i);
           checkPalindrome(string,i,i+1);
       }

       return string.substring(startPoint,startPoint+finalLength);
   }

    private  void checkPalindrome(String sample, int start, int end) {
        while(start>=0 && end< sample.length()&& sample.charAt(start)==sample.charAt(end)){
            start--;
            end++;
        }
        if(finalLength< end-start-1){
           finalLength = end- start-1;
           startPoint = start+ 1;
        }

    }
}
