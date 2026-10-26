/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26060289_lab2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class lab2_q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Insert temperature in degree Fahrenheit:");
        double fah=sc.nextDouble();
        double celcius=(fah-32)/1.8;
        System.out.printf("Temperature in degree Celcius:%.2f%n",celcius);
        
        // TODO code application logic here
    }
    
}
