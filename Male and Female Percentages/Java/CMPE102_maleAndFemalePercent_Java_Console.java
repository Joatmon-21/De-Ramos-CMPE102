/* Written by: Dan Jandel C. De Ramos */

import java.util.Scanner;

public class CMPE102_maleAndFemalePercent_Java_Console{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        int maleAmount;
        int femaleAmount;
        float malePercent;
        float femalePercent;
        int total;
        String malePercentString;
        String femalePercentString;

        System.out.print("Enter the amount of male students in the class: ");
        maleAmount = input.nextInt();

        System.out.print("Enter the amount of female students in the class: ");
        femaleAmount = input.nextInt();
        input.close();

        total = maleAmount + femaleAmount;
        malePercent = (float) maleAmount/(total)*100;
        femalePercent = (float) femaleAmount/(total)*100;
        malePercentString = String.format("%.02f", malePercent);
        femalePercentString = String.format("%.02f", femalePercent);

        System.out.println("Total Number of Students: " + total);
        System.out.println("Male Students = " + maleAmount + " / " + total + " students");
        System.out.println("Female Students = " + femaleAmount + " / " + total +" students");
        System.out.println("Percentage of Male Students = " + malePercentString + " %");
        System.out.println("Percentage of Female Students = " + femalePercentString + " %");        
    }
}
