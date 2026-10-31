/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class LabTask_w4 {
    public static void main(String[]args){
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Points 1:");
    System.out.print("x:");
    double x1=keyboard.nextDouble();
    System.out.print("y:");
    double y1=keyboard.nextDouble();
    
    System.out.println("Points 2:");
    System.out.print("x:");
    double x2=keyboard.nextDouble();
    System.out.print("y:");
    double y2=keyboard.nextDouble();
    
    System.out.println("Points 3:");
    System.out.print("x:");
    double x3=keyboard.nextDouble();
    System.out.print("y:");
    double y3=keyboard.nextDouble();
    keyboard.nextLine();
    
    if((x2-x1)*(y3-y1)!=(x3-x1)*(y2-y1)){
        System.out.println("Output=True");
    }else{
        System.out.println("Outpuit=False");
    }
       
}
}
