/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab4_q2 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Please insert an integer:");
        int n=keyboard.nextInt();
        int sumOfSeries=0;
        System.out.print("Sum of series:");
        if(n>0){
        for(int a=1;a<=n;a++){
            System.out.print("(");
            for(int b=1;b<=a;b++){
            if (b!=a){
                System.out.print(b+"+");
            }else if(b==a && b!=n){
                System.out.print(b+")+");
            }else if(b==a && b==n){
                System.out.print(b+")");
            }
             sumOfSeries+=b;  
          }
            
        }System.out.print("=");
        }else if(n<0){
            System.out.println("Please enter a positive integer.");
        }else{
        System.out.print(sumOfSeries);
        }
    
}
}
