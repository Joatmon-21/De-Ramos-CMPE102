// Written by: Dan Jandel C. De Ramos

import java.util.Scanner;
import java.util.InputMismatchException;

public class CMPE102_distCalc_Java_Console {

    public static void main(String[]args){

        int hours;
        int hourCounter = 0;
        int speed = 0;
        int unit;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type 1 for metric or 2 for english units");
        unit = input.nextInt();

        try{

            if(unit == 1){
                System.out.println("Enter the speed of the vehicle in kilometers per hour (kp/h)");
                speed = input.nextInt();
            }else if(unit == 2){
                System.out.println("Enter the speed of the vehicle in miles per hour (mp/h)");
                speed = input.nextInt();
            }else{
                System.out.println("You have entered an invalid input. Please rerun the program");
                System.exit(0);
            }
          
            System.out.println("Enter the number of hours the vehicle has traveled");
            hours = input.nextInt();
            input.close();
    
            System.out.println();
    
            
            System.out.println("Time Spent                  Distance Traveled");
            System.out.println("_____________________________________________");
            
            if(unit == 1){
                for(int loop = 0; loop < hours; loop ++){       
                    if(loop == 0){
                        hourCounter++;
                        System.out.println(hourCounter + " Hour" + "                              " + (hourCounter*speed) + " Kilometers");    
                    }else{
                        hourCounter++;
                        System.out.println(hourCounter + " Hours" + "                             " + (hourCounter*speed) + " Kilometers");
                    }
                    
                }
            }
            else{

                for(int loop = 0; loop < hours; loop ++){       
                    if(loop == 0){
                        hourCounter++;
                        System.out.println(hourCounter + " Hour" + "                               " + (hourCounter*speed) + " Miles");    
                    }else{
                        hourCounter++;
                        System.out.println(hourCounter + " Hours" + "                             " + (hourCounter*speed) + " Miles");
                    }
                    
                }
            }
            
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please rerun the program");
        }

    }
    
}