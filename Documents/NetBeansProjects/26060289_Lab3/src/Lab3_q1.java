/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class Lab3_q1 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter two integer number:");
        int firstInt=keyboard.nextInt();
        int secondInt=keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the operand:");
        char operand=keyboard.next().charAt(0);
        keyboard.nextLine();
        if(operand=='+'){
            int sum=firstInt+secondInt;
            System.out.printf("%d + %d = %d%n",firstInt,secondInt,sum);
        }else if(operand=='-'){
            int diff=firstInt-secondInt;
            System.out.printf("%d-%d=%d%n",firstInt,secondInt,diff);
        }else if(operand=='*'){
            int multiplication=firstInt*secondInt;
            System.out.printf("%d*%d=%d%n",firstInt,secondInt,multiplication);
        }else if(operand=='/'){
            int quotient=firstInt/secondInt;
            System.out.printf("%d/%d=%d%n",firstInt,secondInt,quotient);
        }else if(operand=='%'){
            int remainder=firstInt%secondInt;
            System.out.printf("%d%%%d=%d%n",firstInt,secondInt,remainder);
        }    
    }
}
