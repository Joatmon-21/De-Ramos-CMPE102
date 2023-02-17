// Written by: Dan Jandel C. De Ramos

import java.util.Scanner;
import java.util.InputMismatchException;

public class CMPE102_astronomyHelper_Java_Console {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        int userInput;
        int loop = 0;

        do{
            try{
                System.out.println("Select a Planet"); 
                System.out.println("1. Mercury");
                System.out.println("2. Venus");
                System.out.println("3. Earth");
                System.out.println("4. Mars");
                System.out.println("5. Exit the program");
                System.out.print("Enter your selection: ");
                userInput = input.nextInt();

                if(userInput == 1){
                    System.out.println();
                    System.out.println("Mercury");
                    System.out.println("Average distance from the sun: 57.9 million kilometers");
                    System.out.println("Mass: 3.31 x 10^23kg");
                    System.out.println("Surface temperature: -173 to 430 degrees Celsius");
                    System.out.println();
                    continue;
                }else if(userInput == 2){
                    System.out.println();
                    System.out.println("Venus");
                    System.out.println("Average distance from the sun: 108.2 million kilometers");
                    System.out.println("Mass: 4.87 x 10^24kg");
                    System.out.println("Surface temperature: 472 degrees Celsius");
                    System.out.println();
                    continue;
                }else if(userInput == 3){
                    System.out.println();
                    System.out.println("Earth");
                    System.out.println("Average distance from the sun: 149.6 million kilometers");
                    System.out.println("Mass: 5.967 x 10^24kg");
                    System.out.println("Surface temperature: -50 to 50 degrees Celsius");
                    System.out.println();
                    continue;
                }else if(userInput == 4){
                    System.out.println();
                    System.out.println("Mars");
                    System.out.println("Average distance from the sun: 227.9 million kilometers");
                    System.out.println("Mass: 0.6424 x 10^24kg");
                    System.out.println("Surface temperature: -140 to 20 degrees Celsius");
                    System.out.println();
                    continue;
                }else if(userInput == 5){
                    input.close();
                    loop = 1;
                }else{
                    System.out.println();
                    System.out.println("!!! You have entered an invalid input. Please select a number from 1 to 5 only !!!");
                    System.out.println();
                }
                

            }catch(InputMismatchException e){
                System.out.println();
                System.out.println("!!! You have entered an invalid input. Please select a number from 1 to 5 only !!!");
                System.out.println();
                input.nextLine();
            }        
    }while(loop == 0);
            
    }
}