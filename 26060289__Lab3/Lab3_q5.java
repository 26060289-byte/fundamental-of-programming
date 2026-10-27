/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab3_q5 {
    public static void main(String[]args){
    Scanner keyboard=new Scanner(System.in);
    System.out.println("ax+by=e\ncx+dy=f");
    System.out.print("Please enter the value for a:");
    double a=keyboard.nextDouble();
    System.out.print("Please enter the value for b:");
    double b=keyboard.nextDouble();
    System.out.print("Please enter the value for c:");
    double c=keyboard.nextDouble();
    System.out.print("Please enter the value for d:");
    double d=keyboard.nextDouble();
    System.out.print("Please enter the value for e:");
    double e=keyboard.nextDouble();
    System.out.print("Please enter the value for f:");
    double f=keyboard.nextDouble();
    keyboard.nextLine();
    double checkSol=a*d-b*c;
    double epsilon=0.00001;
    if(Math.abs(checkSol)<epsilon){
        System.out.println("The equation has no solution");
    }else{
        double x=(double)(e*d-b*f)/(a*d-b*c);
        double y=(double)(a*f-e*c)/(a*d-b*c);
        System.out.printf("x=%.2f y=%.2f%n",x,y);
    }
    } 
}
