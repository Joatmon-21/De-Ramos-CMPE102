/*
Written by: Dan Jandel C. De Ramos
Random numbers generated using: https://numbergenerator.org/randomnumbergenerator/1-100#!numbers=20&low=1&high=100&unique=true&csv=&oddeven=&oddqty=0&sorted=false&addfilters=
*/

import java.util.Arrays;

public class CMPE102_sortBench_Java_Console{

    public static int[] bubbleSortArray = {11, 21, 31, 96, 25, 20, 6, 44, 60, 85, 100, 27, 14, 8, 36, 34, 2, 95, 76, 54};
    public static int[] insertionSortArray = {11, 21, 31, 96, 25, 20, 6, 44, 60, 85, 100, 27, 14, 8, 36, 34, 2, 95, 76, 54};
    public static int[] selectionSortArray = {11, 21, 31, 96, 25, 20, 6, 44, 60, 85, 100, 27, 14, 8, 36, 34, 2, 95, 76, 54};

    public static void bubbleSort(){
        int bubbleSwapCount = 1;

        for(int bubbleLoop1 = 1; bubbleLoop1 < bubbleSortArray.length; bubbleLoop1++){
            for(int bubbleLoop2 = 0; bubbleLoop2 < (bubbleSortArray.length-1); bubbleLoop2++){
                if(bubbleSortArray[bubbleLoop2] > bubbleSortArray[bubbleLoop2+1]){
                    bubbleSwapCount++;
                    int bubbleTemp = bubbleSortArray[bubbleLoop2+1];          // Creating a temporary placeholder as the next value would overwrite the value before it
                    bubbleSortArray[bubbleLoop2+1] = bubbleSortArray[bubbleLoop2];  // Assigning the larger value to the next array position
                    bubbleSortArray[bubbleLoop2] = bubbleTemp;                // Returning the temporary value to the value prior to the overwritten one
                }
            } 
        }

        System.out.print("Bubble Sorted Array: ");

        for(int loop = 0; loop < bubbleSortArray.length; loop++){
            System.out.print(bubbleSortArray[loop] + " ");
        }
        System.out.println();

        System.out.println("Number of swaps performed: " + bubbleSwapCount);
    }

    public static void insertionSort(){
        int insertionSwapCount = 1;

        for(int insertionLoop1 = 1; insertionLoop1 < insertionSortArray.length; insertionLoop1++){
            for(int insertionLoop2 = insertionLoop1; insertionLoop2 > 0 && insertionSortArray[insertionLoop2-1] > insertionSortArray[insertionLoop2]; insertionLoop2--){                
                    int insertionTemp = insertionSortArray[insertionLoop2-1];
                    insertionSortArray[insertionLoop2-1] = insertionSortArray[insertionLoop2];
                    insertionSortArray[insertionLoop2] = insertionTemp;
                insertionSwapCount++;
            }
        }

        System.out.print("Insertion Sorted Array: ");

        for(int loop = 0; loop < insertionSortArray.length; loop++){
            System.out.print(insertionSortArray[loop] + " ");
        }

        System.out.println();

        System.out.println("Number of swaps performed: " + insertionSwapCount);
    }

    public static void selectionSort(){
        int selectionSwapCount = 1;
        int selectionLoop2;

        for(int selectionLoop1 = 0; selectionLoop1 < selectionSortArray.length; selectionLoop1++){
            int smallerValue = selectionLoop1;
            for(selectionLoop2 = (selectionLoop1+1); selectionLoop2 < selectionSortArray.length; selectionLoop2++){
                if(selectionSortArray[selectionLoop2] < selectionSortArray[smallerValue]){
                    smallerValue = selectionLoop2;
                }
            }
            if(smallerValue != selectionLoop1){                
                int selectionTemp = selectionSortArray[selectionLoop1];
                selectionSortArray[selectionLoop1] = selectionSortArray[smallerValue];
                selectionSortArray[smallerValue] = selectionTemp;
                selectionSwapCount++;
            }
        }

        System.out.print("Selection Sorted Array: ");

        for(int loop = 0; loop < selectionSortArray.length; loop++){
            System.out.print(selectionSortArray[loop] + " ");
        }

        System.out.println();

        System.out.println("Number of swaps performed: " + selectionSwapCount);
    }

    public static void main(String[] args) {
        
        
        System.out.print("Unsorted Array: ");
        for(int bubbleLoop = 0; bubbleLoop < bubbleSortArray.length; bubbleLoop++ ){
        System.out.print(bubbleSortArray[bubbleLoop] + " ");
        }

        System.out.println();
        System.out.println();

        bubbleSort();
        System.out.println();

        insertionSort();
        System.out.println();

        selectionSort();
    }
} 