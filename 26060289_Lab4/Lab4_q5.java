/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Random;
public class Lab4_q5 {
    public static void main(String[]args){
        Random r=new Random();
        int diceNumP1=0;
        int diceNumP2=0;
       
        while(true){
            diceNumP1+=r.nextInt(1,6);
            diceNumP2+=r.nextInt(1,6);
            
            System.out.println("Points for player 1:"+diceNumP1);
            System.out.println("Points for player 2:"+diceNumP2);
            
            if(diceNumP1==6){
              diceNumP1+=r.nextInt(1,6); 
              System.out.println("Congrats! Extra Points!Points for player 1:"+diceNumP1);
            }
            
            if(diceNumP2==6){
              diceNumP2+=r.nextInt(1,6);  
              System.out.println("Congrats! Extra Points!Points for player 2:"+diceNumP2);
            }
            
            if(diceNumP1>=100||diceNumP2>=100){
               break;
            }
            
        }
            if(diceNumP1>diceNumP2){
            System.out.println("The winner is Player 1");
            }else if(diceNumP2>diceNumP1){
             System.out.println("The winner is Player 2");  
            }else{
             System.out.println("Tie.");  
            }
            
        }
        
    }
    

