/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab4_q3 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter a score [negative score to quit]:");
        int scoreInput=keyboard.nextInt();
        int n=0;
        int sumOfScore=0;
        int maxScore=scoreInput;
        int minScore=scoreInput;
        int sumSqrOfScore=0;
        while(scoreInput>=0){
            n++;
            sumOfScore+=scoreInput;
            sumSqrOfScore+=(scoreInput*scoreInput);
            if (scoreInput>=maxScore){
            maxScore=scoreInput;   
        }else if(scoreInput<=minScore){
            minScore=scoreInput;
        }
            System.out.print("Enter a score[negative score to quit]:");
            int scoreInput2=keyboard.nextInt();
            scoreInput=scoreInput2;
    }
        System.out.println("Minimum Score:"+minScore);
        System.out.println("Maximum Score:"+maxScore);
        System.out.println("Average Score:"+((double)sumOfScore/n));
        int sqrOfSum=sumOfScore*sumOfScore;
        double stdDevi=Math.sqrt((sumSqrOfScore-((double)sqrOfSum/n))/(n-1));
        System.out.println("Standard Deviation:"+stdDevi);
    }
    
}
