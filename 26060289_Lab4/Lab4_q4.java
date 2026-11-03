/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab4_q4 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Please enter the year:");
        int year=keyboard.nextInt();
        System.out.print("Please enter the first day of the year(0 for Sunday, 1 For Monday...):");
        int firstDay=keyboard.nextInt();
        int febDays;
        
        if((year%4==0 && year%100!=0)||year%400==0 ){ 
        febDays = 29;    
        }else{
        febDays=28;
        }
        
        int daysBeforeMay = 31 + febDays + 31 + 30;
        int daysBeforeAugust = daysBeforeMay + 31 + 30 + 31;
        int firstDayOfMay = (firstDay + daysBeforeMay) % 7;
        int firstDayOfAugust = (firstDay + daysBeforeAugust) % 7;

        System.out.println("\nMay " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDayOfMay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);

            if ((firstDayOfMay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        
        System.out.println("\nAugust " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDayOfAugust; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);

            if ((firstDayOfAugust + day) % 7 == 0) {
                System.out.println();
            }
        }

        
        
        }
    }
    

