/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg26060289_lab2;

/**
 *
 * @author USER
 */
import java.util.Random;
public class lab2_q3 {
    public static void main(String[]args){
        Random r= new Random();
        int num_1=r.nextInt(10,51);
        int num_2=r.nextInt(10,51);
        int num_3=r.nextInt(10,51);
        System.out.println("Random number 1: "+num_1);
        System.out.println("Random number 2: "+num_2);
        System.out.println("Random number 3: "+num_3);
        int sumNum=num_1+num_2+num_3;
        double avgNum=sumNum/3;
        System.out.println("Sum of the numbers: "+sumNum);
        System.out.printf("Average of the numbers: %.2f%n",avgNum);
        
    }
    
}
