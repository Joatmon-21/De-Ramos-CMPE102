import java.util.Scanner;;

public class CMPE102_paintJob_Java_Console2 {
    

    public static double paintCost(double paintGallon, double paintPrice){
        return paintGallon * paintPrice;
    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        paintCost(input.nextDouble(), input.nextDouble());
        input.close();
        
        System.out.println(paintCost(paintGallon));
    }
}
