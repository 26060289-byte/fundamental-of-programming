/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab4_q1 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int intInput=keyboard.nextInt();
        System.out.print("The factors are:");
        for(int a=1;a<=intInput;a++){
            if(intInput%a==0){
                System.out.print(a+" ");
            }
        }
    }
    
}
