# Written by: Dan Jandel C. De Ramos
# Random numbers generated using: https://numbergenerator.org/randomnumbergenerator/1-100#!numbers=20&low=1&high=100&unique=true&csv=&oddeven=&oddqty=0&sorted=false&addfilters=

bubbleSortArray = [11, 21, 31, 96, 25, 20, 6, 44, 60, 85, 100, 27, 14, 8, 36, 34, 2, 95, 76, 54]
insertionSortArray = [11, 21, 31, 96, 25, 20, 6, 44, 60, 85, 100, 27, 14, 8, 36, 34, 2, 95, 76, 54]
selectionSortArray = [11, 21, 31, 96, 25, 20, 6, 44, 60, 85, 100, 27, 14, 8, 36, 34, 2, 95, 76, 54]

def bubbleSort():
    bubbleSwapCount = 1

    for bubbleLoop1 in range(1, len(bubbleSortArray)):
        for bubbleLoop2 in range(0, (len(bubbleSortArray))-1):
            if(bubbleSortArray[bubbleLoop2] > bubbleSortArray[bubbleLoop2+1]):
                bubbleSortArray[bubbleLoop2], bubbleSortArray[bubbleLoop2+1] = bubbleSortArray[bubbleLoop2+1], bubbleSortArray[bubbleLoop2]
                bubbleSwapCount+=1
        

    print("Bubble Sorted Array:", end = " ")
    loop = 0
    while(loop < len(bubbleSortArray)):
        print(bubbleSortArray[loop], end = " ")
        loop+=1
    
    print()

    print("Number of swaps performed:", bubbleSwapCount)

def insertionSort():
    insertionSwapCount = 1
    
    for insertionLoop1 in range(1, len(insertionSortArray)):
        insertionLoop2 = insertionLoop1
        while insertionLoop2 > 0 and insertionSortArray[insertionLoop2-1] > insertionSortArray[insertionLoop2]:
            insertionSortArray[insertionLoop2],insertionSortArray[insertionLoop2-1] = insertionSortArray[insertionLoop2-1], insertionSortArray[insertionLoop2]
            insertionSwapCount+=1
            insertionLoop2-=1

    print("Insertion Sorted Array:", end = " ")
    loop = 0
    while(loop < len(insertionSortArray)):
        print(insertionSortArray[loop], end = " ")
        loop+=1
    
    print()

    print("Number of swaps performed:", insertionSwapCount)

def selectionSort():
    selectionSwapCount = 1

    for selectionLoop1 in range(0, len(selectionSortArray)):
        smallerValue = selectionLoop1
        selectionLoop2 = selectionLoop1+1
        for selectionLoop2 in range(selectionLoop2, len(selectionSortArray)):
            if(selectionSortArray[selectionLoop2] < selectionSortArray[smallerValue]):
                smallerValue = selectionLoop2
        if(smallerValue != selectionLoop1):
            selectionSortArray[selectionLoop1], selectionSortArray[smallerValue] = selectionSortArray[smallerValue], selectionSortArray[selectionLoop1]
            selectionSwapCount+=1

    print("Selection Sorted Array:", end = " ")
    loop = 0
    while(loop < len(selectionSortArray)):
        print(selectionSortArray[loop], end = " ")
        loop+=1
    
    print()

    print("Number of swaps performed:", selectionSwapCount)


print("Unsorted Array:", end = " ")
for bubbleLoop in range(0, len(bubbleSortArray)):
    print(bubbleSortArray[bubbleLoop], end = " ")
    


print()
print()

bubbleSort()
print()
insertionSort()
print()
selectionSort()