package pkg26060289_lab2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class lab2_q2 {
    public static void main(String[] args) {
    Scanner keyboard=new Scanner(System.in);
    System.out.print("Insert the price of the car:");
    double P=keyboard.nextDouble();
    System.out.print("Insert the down payment:");
    double D=keyboard.nextDouble();
    System.out.print("Insert the Interest Rate in %:");
    double R=keyboard.nextDouble();
    System.out.print("Insert the loan duration in years:");
    int Y=keyboard.nextInt();
    
    if(P<0||D<0||D>P||R<0||Y<=0){
        System.out.println("Invalid Input.");
    }else{
    double M=(P-D)*(1+R*Y/100)/(Y*12);
    System.out.println();
    System.out.printf("Monthly Payment=%.2f%n",M);
    }       
         
    }
    
}
