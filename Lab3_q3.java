/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab3_q3 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Please insert the sales volume:");
        int salesVol=keyboard.nextInt();
        keyboard.nextLine();
        double commission;
        double rate;//java cannot guarantee rate always receive value if sale<0 so need to initialise here
        if(salesVol<0){
          System.out.println("Sales volume cannot be negative.");
        }else{
         if(salesVol<=100){
           rate=0.05;
         }else if (salesVol>100&& salesVol<=500){
           rate=0.075;
         }else if (salesVol>500&& salesVol<=1000){
           rate=0.1;
         }else{
           rate=0.125;
         }
         commission= salesVol*rate;
         System.out.printf("Commission: %.2f%n",commission);
         
        }
        
        
    }
    
}
