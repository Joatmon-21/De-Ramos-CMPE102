# Written by: Dan Jandel C. De Ramos

import random

def lotteryNumberGenerator():

    loop = 0
    lotteryNumbers = [0]*7

    while(loop < len(lotteryNumbers)):
        lotteryNumbers[loop] = random.randint(0, 9) # Generates a random integer in the range of 0 to 9
        print(lotteryNumbers[loop], end=" ")
        loop+=1


print("Generated Lottery Numbers: ", end="")
lotteryNumberGenerator()