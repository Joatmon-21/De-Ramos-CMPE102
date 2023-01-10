/* Written by: Dan Jandel C. De Ramos */

import java.util.Scanner;

public class CMPE102_maleAndFemalePercent_Java_Console{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        float maleAmount;
        float femaleAmount;
        float total;
        float malePercent;
        float femalePercent;
        String malePercentString;
        String femalePercentString;

        System.out.println();
        System.out.print("Enter the amount of male students in the class: ");
        maleAmount = input.nextInt();

        System.out.print("Enter the amount of female students in the class: ");
        femaleAmount = input.nextInt();
        input.close();

        total = maleAmount + femaleAmount;
        malePercent = (maleAmount/total)*100;
        femalePercent = (femaleAmount/total)*100;
        malePercentString = String.format("%.02f", malePercent);
        femalePercentString = String.format("%.02f", femalePercent);

        System.out.println();
        System.out.println("Total Number of Students: " + (int)total);
        System.out.println("Male Students: " + (int)maleAmount + " / " + (int)total);
        System.out.println("Female Students: " + (int)femaleAmount + " / " + (int)total);
        System.out.println("Percentage of Male Students: " + malePercentString + " %");
        System.out.println("Percentage of Female Students: " + femalePercentString + " %");
        System.out.println();
    }
}
