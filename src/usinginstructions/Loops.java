/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usinginstructions;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Dinamo
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        do{
        System.out.println("Choose and item form the list below: ");
        System.out.println("____________________________________");
        System.out.println("1. Hot dog");
        System.out.println("2. Hamburger");
        System.out.println("3. Cheeseburger");
        System.out.println("4. Veggie Burger");
        System.out.println("5. Nachos");
        choise = sc.nextInt();
        }while(choise != 1 && choise != 2 && choise != 3 && choise != 4 && choise !=5 );
        switch (choise){
            case 1:
                System.out.println("You chose a hot dog, that is $1.00");
                break;
            case 2:
                System.out.println("You chose a hamburger, that is $2.50");
                break;
            case 3:
                System.out.println("You chose a cheeseburger, that is $3.00");
                break;
            case 4:    
                System.out.println("You chose a veggie burges, that is $3.25");
                break;
            case 5:
                System.out.println("You chose nachos, that is $1.75");
                break;
            default:
                System.out.println("Have good day");
                break;    
        }
        // loan problem
        double loanBalance = 5000;
        int months = 0;
        while(loanBalance >0){
            loanBalance -= 500;
            months ++;
        }
        System.out.println("It will take "+months+" months to pay back your loan");
        
        //print all odd numbers between 1 and 100
        System.out.println("Odd number between 1 and 100");
        for(int i = 1; i<101; i++){
            if(i%2 == 1){
            System.out.print(i+", ");
            }
            //System.out.println("99\n");
        }
        }
    
    
}
