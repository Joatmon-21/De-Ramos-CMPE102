/* Written by: Dan Jandel C. De Ramos */

import java.util.Scanner;

public class CMPE102_ingredientAdjuster_Java_Console{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        double sugarOneCookie = 0.03125;
        double butterOneCookie = 0.02083;
        double flourOneCookie = 0.05730;
        float sugarTotal;
        float butterTotal;
        float flourTotal;
        int cookies = 0;
        String sugarTotalString;
        String butterTotalString;
        String flourTotalString;

        System.out.println();
        System.out.print("Enter the amount of cookies you wish to bake: ");
                
        while(!input.hasNextInt()){
            System.out.println("");
            System.out.println("You have entered an invalid value. Please try again and use numbers only");
            System.out.print("Enter the amount of cookies you wish to bake: ");
            input.next();
        }

        cookies = input.nextInt();
        input.close();
        
        sugarTotal = (float) sugarOneCookie*cookies;
        butterTotal = (float) butterOneCookie*cookies;
        flourTotal = (float) flourOneCookie*cookies;

        sugarTotalString = String.format("%.02f", sugarTotal);
        butterTotalString = String.format("%.02f", butterTotal);
        flourTotalString = String.format("%.02f", flourTotal);

        System.out.println();
        System.out.println("Ingredients needed for " + cookies + " pieces of cookies");
        System.out.println("Sugar: " + sugarTotalString + " Cups");
        System.out.println("Butter: " + butterTotalString + " Cups");
        System.out.println("Flour: " + flourTotalString + " Cups");
        System.out.println();
        
    }
}
