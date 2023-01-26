/* Written by: Dan Jandel C. De Ramos
 * Data for BMI Ratings obtained from: https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
 * Data for BMI formulas obtained from: https://www.bmi-calculator.net/bmi-formula.php
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CMPE102_BMI_Java_Console{

    public static double calculateMetric(double weight, double height){
        return (weight / (Math.pow((height/100),2)));
    }

    public static double calculateEnglish(double weight, double height){
        return (weight / (Math.pow(height, 2)))*703;
    }
    
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int unit = 0;               
        double bmi = 0;
        double height;
        double weight;
        String bmiString;
        String bmiRating = "";

        try{
        System.out.println("Type 1 for metric or 2 for english units");
        unit = input.nextInt();

        System.out.println();
            if(unit == 1){
            System.out.println("Enter your weight in kilograms (kg)");
            weight = input.nextDouble();
            System.out.println();

            System.out.println("Enter your height in centimeters (cm)");
            height = input.nextDouble();
            System.out.println();

            input.close();

            bmi = calculateMetric(weight, height);       

        }else if(unit == 2){

            System.out.println("Enter your weight in pounds (lb)");
            weight = input.nextDouble();
            System.out.println();

            System.out.println("Enter your height in inches (in)");
            height = input.nextDouble();
            System.out.println();

            input.close();

            bmi = calculateEnglish(weight, height);
        }else{
            System.out.println("You have entered an invalid input. Please rerun the program");
            System.exit(0);
        }

        if(bmi <= 18.5){
            bmiRating = "Underweight";
        }else if(bmi >= 18.6 && bmi <= 24.9){
            bmiRating = "Normal";
        }else if(bmi >= 25.0 && bmi <= 29.9){
            bmiRating = "Overweight";
        }else if(bmi >= 30){
            bmiRating = "Obese";
        }
        
        bmiString = String.format("%.02f", bmi);

        System.out.println("Your BMI is: " + bmiString);
        System.out.print("Your BMI Rating is: " + bmiRating);

    }catch(InputMismatchException e){
        System.out.println("You have entered an invalid input. Please rerun the program");
    }                             

    }
}