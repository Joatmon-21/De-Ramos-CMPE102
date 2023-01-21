/* Written By: Dan Jandel C. De Ramos
 * Data for BMI Ratings obtained from: https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
 * Data for BMI formulas obtained from: https://www.bmi-calculator.net/bmi-formula.php
 */

import java.util.Scanner;

public class CMPE102_BMI_Java_Console{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int unit;
        double weight;
        double height;
        double bmi;
        String bmiRating = "";
        

        System.out.println("Please type 1 for metric and 2 for english units");
        unit = input.nextInt();

        if(unit == 1){

            System.out.println("Please enter your weight in kilograms (kg)");
            weight = input.nextDouble();

            System.out.println("Please enter your height in centimeters (cm)");
            height = input.nextDouble();

            bmi = weight / ((height*100)*(height*100));

            input.close();

            if(bmi <= 18.5){
                bmiRating = "underweight";
            }else if(18.6 >= bmi && bmi <= 24.9){
                bmiRating = "normal";
            }else if(25 >= bmi && bmi <= 29.9){
                bmiRating = "overweight";
            }else if(30 >= bmi){
                bmiRating = "obese";
            }
            
            System.out.println("Your bmi is " + bmi);
            System.out.println("You are: " + bmiRating);

            input.close();

        }else if(unit == 2){

            System.out.println("Please enter your weight in pounds (lb)");
            weight = input.nextDouble();

            System.out.println("Please enter your height in inches (in)");
            height = input.nextDouble();

            input.close();

            bmi = (weight / (Math.pow(height, 2)))*703;

            if(bmi <= 18.5){
                bmiRating = "underweight";
            }else if(18.6 >= bmi && bmi <= 24.9){
                bmiRating = "normal";
            }else if(25 >= bmi && bmi <= 29.9){
                bmiRating = "overweight";
            }else if(30 >= bmi){
                bmiRating = "obese";
            }
            
            System.out.println("Your bmi is " + bmi);
            System.out.println("You are: " + bmiRating);
            
        }
    }
}