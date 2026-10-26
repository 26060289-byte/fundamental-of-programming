/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg26060289_lab2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class lab2_q4 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int initialSecond=keyboard.nextInt();
        int hours=initialSecond/60/60;
        int minutes=(initialSecond-(hours*60*60))/60;
        int seconds=initialSecond-(hours*60*60)-(minutes*60);
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n", initialSecond,hours,minutes,seconds);
               
      
    }
    
    
    
}
