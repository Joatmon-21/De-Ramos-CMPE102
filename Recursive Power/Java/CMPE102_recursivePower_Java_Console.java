// Written by: Dan Jandel C. De Ramos

import java.util.Scanner;

public class CMPE102_recursivePower_Java_Console{

    public static int result(int base, int exponent){
        if(exponent == 0){
            // Any number raised to zero will always be equal to one
            return 1;
        }else{
            // Base multiplied by itself by means of recursion based on the exponent
            return base * result(base, exponent-1);
        }
    }

    public static void main(String[]args){

        // An error might occur during user input. We must add a try - catch statement to handle it.
        try {

            // Variable Declaration & Assignment
            Scanner input = new Scanner(System.in);
            int baseNum;
            int exponentNum;       

            // User input for the base number
            System.out.print("Enter the base: ");
            baseNum = input.nextInt();

            // User input for the exponent
            System.out.print("Enter the exponent: ");
            exponentNum = input.nextInt();

            // Closing the scanner to avoid a memory leak
            input.close();

            // Calling the method to obtain the result
            result(baseNum, exponentNum);

            // Displaying the result of the operation
            System.out.print("Result: " + result(baseNum, exponentNum));    

        } catch (Exception e) {

            // Prompts the user to run the program again since there was an invalid input
            System.out.println("You have entered an invalid input. Please rerun the program and enter numbers only and non-negative numbers for the exponent.");

        }      
    }
}