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
public class lab2_q6 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the amount of water in gram:");
        double waterGram=keyboard.nextDouble();
        double M=waterGram/1000;
        System.out.print("Enter the initial temperature in Fahrenheit:");
        double iniTempF=keyboard.nextDouble();
        double iniTempC=(iniTempF-32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit:");
        double finalTempF=keyboard.nextDouble();
        double finalTempC=(finalTempF-32)/1.8;
        double Q= M*(finalTempC-iniTempC)*4184;
        System.out.printf("The energy needed is %e%n",Q);
                   
    }
    
}
