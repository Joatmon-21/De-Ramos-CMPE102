import java.util.Scanner;

public class CMPE102_paintJob_Java_Console {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int laborTimeHoursInt;
        int laborTimeMinutesInt;
        double wallArea;
        double laborCost;
        double laborTimeMinutesDouble;
        double totalLaborTime;
        double paintGallon;
        double paintCost;
        double paintPrice;
        double totalCost;
        String paintCostString;
        String paintGallonString;
        String laborCostString;
        String totalCostString;

        System.out.println("Enter the area of the wall in square feet");
        wallArea = input.nextInt();

        System.out.println("Enter the price of the paint per gallon (USD)");
        paintPrice = input.nextDouble();

        input.close();

        paintGallon = wallArea/115; /* 115sqft : 1 Gallon of Paint */
        totalLaborTime = paintGallon*8; /* 1 Gallon of Paint : 8 Hours of Labor */
        paintCost = paintGallon*paintPrice;
        laborCost= totalLaborTime*20; /* 8 Hours of Labor : 20 Dollars */
        totalCost = laborCost + paintCost;

        laborTimeHoursInt = (int) totalLaborTime;
        laborTimeMinutesDouble = (double) (totalLaborTime - laborTimeHoursInt);
        laborTimeMinutesInt = (int) (60*laborTimeMinutesDouble);

        paintGallonString = String.format("%.02f", paintGallon);
        paintCostString = String.format("%.02f", paintCost);
        laborCostString = String.format("%.02f", laborCost);
        totalCostString = String.format("%.02f", totalCost);

        System.out.println("Gallons of paint required: " + paintGallonString + " gallons of paint");
        System.out.println("It will take " + laborTimeHoursInt + " Hours and " + laborTimeMinutesInt + " Minutes");
        System.out.println("The paint will cost $" + paintCostString);
        System.out.println("The labor will cost $" + laborCostString + " at a rate of $20 per hour");
        System.out.println("Your total cost equates to: $" + totalCostString);
    }
}
