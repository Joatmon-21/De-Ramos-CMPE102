/*
 Written by: Dan Jandel C. De Ramos
 Random numbers generated using: https://numbergenerator.org/randomnumbergenerator/1-100#!numbers=20&low=1&high=100&unique=true&csv=&oddeven=&oddqty=0&sorted=false&addfilters= 
 */

public class CMPE102_searchBench_Java_Console {

    public static int[] searchArray = {37, 84, 70, 56, 58, 82, 50, 49, 99, 64, 30, 91, 60, 93, 16, 34, 24, 47, 80, 39};
    public static int targetValue = 30;

    public static void binarySearch(){

        int left = 0;
        int middle;
        int right = (searchArray.length - 1);
        int binarySearchComparisonCount = 0;

        while(left <= right){
            middle = (left + right) / 2;
            binarySearchComparisonCount++;
            if(searchArray[middle] == targetValue){
                break;
            }else if(searchArray[middle] < targetValue){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        
        }

        System.out.println("Total comparisons performed using binary search: " + binarySearchComparisonCount);
    }

    public static void sequentialSearch(){

        int sequentialSearchComparisonCount = 0;

        for(int sequentialLoop = 0; sequentialLoop < searchArray.length; sequentialLoop++){
            sequentialSearchComparisonCount++;
            if(searchArray[sequentialLoop] == targetValue){
                break;
            }
        }
        
        System.out.println("Total comparisons performed using sequential search: " + sequentialSearchComparisonCount);

    }

    public static void main(String[] args){

        System.out.print("Given Array: ");
        for(int loop = 0; loop < searchArray.length; loop++){
            System.out.print(searchArray[loop] + " ");
        }
        
        System.out.println();

        System.out.println("Target Value: " + targetValue);

        binarySearch();
        sequentialSearch();
    }
    
}
