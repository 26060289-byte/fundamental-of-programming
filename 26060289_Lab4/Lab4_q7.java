/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab4_q7 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = keyboard.nextDouble();

        System.out.print("Enter interest in %: ");
        double i = keyboard.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int N = keyboard.nextInt();

        // Calculate monthly interest rate
        double r = i / (12 * 100);

        // Calculate monthly payment
        double M;

        if (r == 0) {
            M = P / N;
        } else {
            M = (P * r) / (1 - Math.pow(1 + r, -N));
        }

        // Display table header
        System.out.printf("%-8s %-16s %-14s %-14s %-18s %-15s%n","Month", "Monthly Payment", "Principal","Interest", "Unpaid Balance", "Total Interest");

        double totalInterest = 0;

        // Calculate monthly details
        for (int n = 1; n <= N; n++) {
 
            // Calculate principal portion
            double C;

            if (r == 0) {
                C = M;
            } else {
                C = M * Math.pow(1 + r, -(1 + N - n));
            }

            // Calculate interest due
            double L = M - C;

            // Calculate remaining balance
            double R;

            if (r == 0) {
                R = P - (C * n);
            } else {
                R = (L / r) - C;
            }

            // Avoid tiny negative rounding errors
            if (n == N) {
                R = 0;
            }

            // Calculate total interest
            totalInterest += L;

            // Display output
            System.out.printf("%-8d %-16.2f %-14.2f %-14.2f %-18.2f %-15.2f%n",
                    n, M,C, L, R, totalInterest);
        }
        
    }
    
}
