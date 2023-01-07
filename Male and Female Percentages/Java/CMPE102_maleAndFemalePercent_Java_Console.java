import java.util.Scanner;

public class CMPE102_maleAndFemalePercent_Java_Console{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        float malePercent;
        float femalePercent;
        int total;

        System.out.print("Enter number of male students in the class: ");
        int maleAmount = input.nextInt();

        System.out.print("Enter number of female students in the class: ");
        int femaleAmount = input.nextInt();
        input.close();

        total = maleAmount + femaleAmount;
        malePercent = (float) maleAmount/(total)*100;
        femalePercent = (float) femaleAmount/(total)*100;
        String malePercentString = String.format("%.02f", malePercent);
        String femalePercentString = String.format("%.02f", femalePercent);

        System.out.println("Total Number of Students: " + total);
        System.out.println("Male Students = " + maleAmount + " / " + total + " students");
        System.out.println("Female Students = " + femaleAmount + " / " + total +" students");
        System.out.println("Percentage of Male Students = " + malePercentString + " %");
        System.out.println("Percentage of Female Students = " + femalePercentString + " %");        
    }
}
