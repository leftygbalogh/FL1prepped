/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fl1;

import java.util.Scanner;

/**
 *
 * @author lefty
 */
public class FL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Your number is... ");
        int number = keyboard.nextInt();
        boolean odd = true;
        
        for (int i=2;;){
            System.out.println("i="+i);
            System.out.println("number is="+number);
            System.out.println("number%i="+number%i);
            System.out.println("odd="+odd);
        
            if (number%i == 0){
                 odd = false;
                 System.out.println("odd="+odd);
                 break;}}
         
        if (odd){
             System.out.println("Odd number");         }
         else {
             System.out.println("Even number");}}}
