/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Random;
public class Lab4_q6 {
    public static void main(String[]args){
        Random r=new Random();
        int num=r.nextInt(100000);
        System.out.println("Non-negative random integer:"+num);
        int count=0;
        
         if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
          System.out.println("Number of digits: " + count);
        
        
    }
    
}
