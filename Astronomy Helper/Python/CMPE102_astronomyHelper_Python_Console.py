# Written by: Dan Jandel C. De Ramos

loop = 0

while loop == 0:
    try:
        print("Select a Planet"); 
        print("1. Mercury");
        print("2. Venus");
        print("3. Earth");
        print("4. Mars");
        print("5. Exit the program");
        print("Enter your selection: ", end = "");
        userInput = (int(input("")))

        if(userInput == 1):
            print()
            print("Mercury")
            print("Average distance from the sun: 57.9 million kilometers")
            print("Mass: 3.31 x 10^23kg")
            print("Surface temperature: -173 to 430 degrees Celsius")
            print()
            continue
        elif(userInput == 2):
            print()
            print("Venus")
            print("Average distance from the sun: 108.2 million kilometers")
            print("Mass: 4.87 x 10^24kg")
            print("Surface temperature: 472 degrees Celsius")
            print()
            continue
        elif(userInput == 3):
            print()
            print("Earth")
            print("Average distance from the sun: 149.6 million kilometers")
            print("Mass: 5.967 x 10^24kg")
            print("Surface temperature: -50 to 50 degrees Celsius")
            print()
            continue
        elif(userInput == 4):
            print()
            print("Mars")
            print("Average distance from the sun: 227.9 million kilometers")
            print("Mass: 0.6424 x 10^24kg")
            print("Surface temperature: -140 to 20 degrees Celsius")
            print()
            continue
        elif(userInput == 5):
            loop = 1
        else:
            print()
            print("!!! You have entered an invalid input. Please select a number from 1 to 5 only !!!")
            print()
    except:
        print()
        print("!!! You have entered an invalid input. Please select a number from 1 to 5 only !!!")
        print()