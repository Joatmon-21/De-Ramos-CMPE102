// Written by: Dan Jandel C. De Ramos

import java.util.Random;

public class CMPE102_lotNumGen_Java_Console{
    
    public static void lotterNumberyGenerator(){
        Random randomizer = new Random();
        int[] lotteryNumbers = new int[7];
        
        for(int loop = 0; loop < lotteryNumbers.length; loop++){
            lotteryNumbers[loop] = randomizer.nextInt(10);
            System.out.print(lotteryNumbers[loop] + " ");
        }
    }

    public static void main(String[] args) {
        
    System.out.print("Lottery Numbers: ");
    lotterNumberyGenerator();
    }
}