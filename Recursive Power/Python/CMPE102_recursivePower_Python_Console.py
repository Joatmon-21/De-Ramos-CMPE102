# Written by: Dan Jandel C. De Ramos

def result(base, exponent):
    if(exponent == 0):
        # Any number raised to zero will always be equal to one
        return 1
    else:
        # Base multiplied by itself by means of recursion based on the exponent
        return base * result(base, exponent-1)
        
# An error might occur during user input. We must add a try - catch statement to handle it.
try:
    # User input for the base number
    baseNum = ((int(input("Enter the base: "))))

    # User input for the exponent
    exponentNum = ((int(input("Enter the exponent: "))))

    # Calling the module to obtain the result
    result(baseNum, exponentNum)

    # Displaying the result of the operation
    print("Result:", result(baseNum, exponentNum))

except:
    # Prompts the user to run the program again since there was an invalid input
    print("You have entered an invalid input. Please rerun the program and enter numbers only and non-negative numbers for the exponent.")