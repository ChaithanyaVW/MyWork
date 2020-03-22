package com.chaitu;

import java.util.*;

public class LeadGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
       LinkedList<String> playerOne= new LinkedList<String>();
       LinkedList<String> playerTwo= new LinkedList<String>();
        scanner.nextLine();
        while(rounds!=0){
           String[] input = scanner.nextLine().split(" ");
           playerOne.add(input[0]);
           playerTwo.add(input[1]);
           rounds--;
        }
        getWinner(playerOne, playerTwo);
    }

    private static void getWinner(List<String> player1, List<String> player2 ){
        int[] result = new int[2];
        Arrays.fill(result, 0);
        int score1 = 0,score2 =0;
        for(int i =0; i< player1.size(); i++){
            score1= Integer.parseInt(player1.get(i));
            score2= Integer.parseInt(player2.get(i));
            if(score1>score2){
             if(result[0]< (score1-score2)) {result[1]=1; result[0]= score1-score2;}
            }
           else{
                if(result[0]< (score2-score1)) {result[1]=2; result[0]= score2-score1;}
            }
        }

        System.out.println(result[1] + " "+ result[0]);
    }
}
