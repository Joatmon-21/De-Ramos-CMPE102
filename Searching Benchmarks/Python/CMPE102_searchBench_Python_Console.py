# Written by: Dan Jandel C. De Ramos
# Random numbers generated using: https://numbergenerator.org/randomnumbergenerator/1-100#!numbers=20&low=1&high=100&unique=true&csv=&oddeven=&oddqty=0&sorted=false&addfilters= 

searchArray = [37, 84, 70, 56, 58, 82, 50, 49, 99, 64, 30, 91, 60, 93, 16, 34, 24, 47, 80, 39]

targetValue = 30

def binarySearch():
    left = 0
    right = (len(searchArray)-1)

    binarySearchComparisonCount = 0

    while(left <= right):
        middle = (left + right) //2
        binarySearchComparisonCount+=1
        if(searchArray[middle] == targetValue):
            middle = searchArray[middle]
        elif(searchArray[middle] < targetValue):
            left = middle + 1
        else:
            right = middle -1
    print("Total comparisons performed using binary search: ", binarySearchComparisonCount)

def sequentialSearch():
    sequentialSearchComparisonCount = 0
    for sequentialLoop in range(0, len(searchArray)):
        sequentialSearchComparisonCount+=1
        if(searchArray[sequentialLoop] == targetValue):
            break

    print("Total comparisons performed during sequential search:", sequentialSearchComparisonCount)

print("Unsorted Array:", end = " ")
for loop in range(0, len(searchArray)):
    print(searchArray[loop], end = " ")
print()
print("Target Value:", targetValue)
binarySearch()
sequentialSearch()
