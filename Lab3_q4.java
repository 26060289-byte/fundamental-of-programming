/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Random;
public class Lab3_q4 {
    public static void main(String[]args){
        Random rand=new Random();
        int dice1Player1=rand.nextInt(1,7);
        int dice2Player1=rand.nextInt(1,7);
        int dice1Player2=rand.nextInt(1,7);
        int dice2Player2=rand.nextInt(1,7);
        System.out.printf("Player 1:%nDice 1:%d    Dice 2:%d%n",dice1Player1,dice2Player1);
        System.out.printf("Player 2:%nDice 1:%d    Dice 2:%d%n",dice1Player2,dice2Player2);
        int sumPlayer1= dice1Player1+dice2Player1;
        int sumPlayer2= dice1Player2+dice2Player2;
        System.out.printf("Score:%nPlayer 1:%d  Player 2:%d%n",sumPlayer1,sumPlayer2);
        if (sumPlayer1>sumPlayer2){
            System.out.println("Player 1 is the winner!Congratulation!");
        }else if(sumPlayer2>sumPlayer1){
            System.out.println("Player 2 is the winner!Congratulation!");
        }else{
            System.out.println("Tie!");
        }
          
    }
    
}
