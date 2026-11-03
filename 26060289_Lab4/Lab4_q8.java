/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Random;
public class Lab4_q8 {
    public static void main(String[] args) {
        Random r=new Random();
        int n = r.nextInt(101);

        System.out.println("Random number: " + n);
        System.out.println("First " + n + " prime numbers:");

        int count = 0;
        int number = 2;
        boolean isPrime=true;

        
        while (count < n) {
            isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    isPrime=false;
                   
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

        System.out.println();
    }
    
}
