/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab3_q6 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the radius of a circle:");
        double rad=keyboard.nextDouble();
        System.out.print("For coordinate point(x,y), enter the value for x and y:");
        double x=keyboard.nextDouble();
        double y=keyboard.nextDouble();
        keyboard.nextLine();
        double distance=Math.sqrt(Math.pow(x-0,2)+Math.pow(y-0,2));
        if (distance<=rad){
            System.out.println("The point is inside the circle centered at(0,0)");
        }else{
            System.out.println("The point is not inside the circle centered at(0,0)");
        }
      
    }
    
}
