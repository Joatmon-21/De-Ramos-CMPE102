import java.util.Scanner;

public class CMPE102_Jan_7_2023_Java_Console{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        float malesPercent;
        float femalesPercent;
        int total;

        System.out.println("Enter number of male students in the class");
        int malesAmount = input.nextInt();

        System.out.println("Enter number of female students in the class");
        int femalesAmount = input.nextInt();
        input.close();

        total = malesAmount + femalesAmount;
        malesPercent = (float) malesAmount/(malesAmount+femalesAmount)*100;
        femalesPercent = (float) femalesAmount/(malesAmount+femalesAmount)*100;
        String malesPercentString = String.format("%.02f", malesPercent);
        String femalesPercentString = String.format("%.02f", femalesPercent);

        System.out.println("Total Number of Students: " + total);
        System.out.println("Male Students = " + malesAmount + "/" + total + "students");
        System.out.println("Male Students = " + femalesAmount + "/" + total +"students");
        System.out.println("Percentage of male students = " + malesPercentString + "%");
        System.out.println("Percentage of female students = " + femalesPercentString + "%");        
    }
}
