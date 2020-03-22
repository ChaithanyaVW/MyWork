package com.chaitu;

import java.util.Arrays;

public class Encryption {
    public static void main(String[] args) {
        String input = "chillout";
        System.out.println(encryption(input));
    }

    private static String encryption(String input) {
        String temp = input.replaceAll("\\s", "");
        int index_i =0, index_j =0;
        StringBuilder result = new StringBuilder();
        int k =0;
        double root = Math.sqrt(temp.length());
        char[][] stringMatrix;
        if((int)root * (int)root <= temp.length() ) {
            if((int)root * (int)root < temp.length()) root = (int) root +1;
             stringMatrix = new char[(int) root][(int) root];
            for (int i = 0; i < (int) root; i++) {
                for (int j = 0; j <(int) root; j++) {
                    if(k>=temp.length())break;
                    stringMatrix[i][j] = temp.charAt(k);
                    k++;
                }
            }
        }
         else {
            index_i = (int) root;
            index_j = index_i+1;
         stringMatrix = new char[index_i][index_j];
            for (int i = 0; i < index_i; i++) {
                for (int j = 0; j < index_j; j++) {
                    if(k>=temp.length())break;
                    stringMatrix[i][j] =
                            temp.charAt(k);
                    k++;
                }
            }
            }
         for(int i =0; i< stringMatrix[0].length; i++){
             for(int j =0 ; j<stringMatrix.length; j++){
                 if(stringMatrix[j][i]=='\0') break;
                result.append(stringMatrix[j][i]);
             }
            result.append(" ");
         }

        return result.toString();
    }
}
