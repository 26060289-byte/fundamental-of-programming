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
public class lab2_q5 {
    public static void main(String[]args){
        Random r= new Random();
        int num=r.nextInt(0,10001);
        System.out.println("Random Number:"+num);
        int d1=num/10000;
        int d2=(num/1000)%10;
        int d3=(num/100)%10;
        int d4=(num/10)%10;
        int d5=num%10;
        
        int sumDigit= d1+d2+d3+d4+d5;
        System.out.println("Sum of all the digits in the number:"+sumDigit);
        
    }
    
}
