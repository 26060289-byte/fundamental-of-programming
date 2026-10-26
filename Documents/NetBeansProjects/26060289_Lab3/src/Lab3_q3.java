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
        if(salesVol<=100){
            commission= salesVol*0.05;
            System.out.printf("Commission: %.2f%n",commission);
        }else if (salesVol>100&& salesVol<=500){
            commission= salesVol*0.075;
            System.out.printf("Commission: %.2f%n",commission);
         }else if (salesVol>500&& salesVol<=1000){
            commission= salesVol*0.1;
            System.out.printf("Commission: %.2f%n",commission);
         }else if (salesVol>1000){
           commission= salesVol*0.125;
            System.out.printf("Commission: %.2f%n",commission);
         }
    }
    
}
