/*
Written by: Dan Jandel C. De Ramos
Random numbers generated using: https://numbergenerator.org/randomnumbergenerator/1-100#!numbers=20&low=1&high=100&unique=true&csv=&oddeven=&oddqty=0&sorted=false&addfilters= 
*/

#include<iostream>

using namespace std;

int searchArray[] = {37, 84, 70, 56, 58, 82, 50, 49, 99, 64, 30, 91, 60, 93, 16, 34, 24, 47, 80, 39};
int targetValue = 30;

void binarySearch(){
    int left = 0;
        int middle;
        int right = ((sizeof(searchArray)/sizeof(int)) - 1);
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

        cout << "Total comparisons performed using binary search: " << binarySearchComparisonCount;
}

void sequentialSearch(){

    int sequentialSearchComparisonCount = 0;

    for(int sequentialLoop = 0; sequentialLoop < (sizeof(searchArray)/sizeof(int)); sequentialLoop++){
        sequentialSearchComparisonCount++;
        if(searchArray[sequentialLoop] == targetValue){
            break;
        }
    }
        
        cout << "Total comparisons performed using sequential search: " << sequentialSearchComparisonCount;

    }
    
int main(){

    cout << "Given Array: ";
    for(int loop = 0; loop < (sizeof(searchArray)/sizeof(int)); loop++){
        cout << searchArray[loop] << " ";
    }
    
    cout << "\n";
    cout << "Target Value: " << targetValue << "\n";
    binarySearch();
    cout << "\n";
    sequentialSearch();
}