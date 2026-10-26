/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Random;
public class Lab3_q2 {
    public static void main(String[]args){
        Random rand=new Random();
        int randInt=rand.nextInt(0,6);
        switch(randInt){
            case 0-> System.out.println("0 is zero.");
            case 1-> System.out.println("1 is one.");
            case 2-> System.out.println("2 is two.");
            case 3-> System.out.println("3 is three.");
            case 4-> System.out.println("4 is four.");
            case 5-> System.out.println("5 is five.");
        }
    }
    
}
