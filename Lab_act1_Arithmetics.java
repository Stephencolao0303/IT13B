package Prelim;


public class Lab_act1_Arithmetics {

    public static void main(String[] args) {
       
        int firstNumber = 10;
        int secondNumber = 4;
        int thirdNumber = 6;

        
        int result1 = firstNumber * secondNumber + thirdNumber;
        int result2 = (firstNumber - secondNumber) % thirdNumber;
        int result3 = (firstNumber + secondNumber + thirdNumber) / 3;
        int result4 = firstNumber * thirdNumber - (secondNumber * secondNumber);

       
        System.out.println(firstNumber + " * " + secondNumber + " + " + thirdNumber + " = " + result1);
        System.out.println("(" + firstNumber + " - " + secondNumber + ") % " + thirdNumber + " = " + result2);
        System.out.println("(" + firstNumber + " + " + secondNumber + " + " + thirdNumber + ") / 3 = " + result3);
        System.out.println(firstNumber + " * " + thirdNumber + " - (" + secondNumber + " * " + secondNumber + ") = " + result4);
    }
}
    
