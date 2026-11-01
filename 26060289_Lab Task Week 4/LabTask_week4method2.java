

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author USER
 */
import java.util.Scanner;
public class LabTask_week4sampleans {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        // Get the coordinates of the 3 points
        int[][] points = new int[3][2]; 
        // [3][2] means 3 rows, 2 columns 

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter x-coordinate of point "+ (i + 1) + ": ");
            points[i][0] = keyboard.nextInt(); //store in row i, column 0

            System.out.print("Enter y-coordinate of point "+ (i + 1) + ": ");
            points[i][1] = keyboard.nextInt();// store in row i, column 2
        }

        // Store the coordinates in separate variables
        int x1 = points[0][0];
        int y1 = points[0][1];

        int x2 = points[1][0];
        int y2 = points[1][1];

        int x3 = points[2][0];
        int y3 = points[2][1];

        // Check whether the 3 points are NOT on the same straight line
        if ((y2 - y1) * (x3 - x1)!= (y3 - y1) * (x2 - x1)) {

            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

    }
}

   

    
