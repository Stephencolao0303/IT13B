
package Prelim;

import java.util.Scanner;

public class Lab_act1_Arithmetics {

     public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

      
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        
        System.out.println("The greatest number is: " + greatest);

        
        scanner.close();
     }
}
