# Written by Dan Jandel C. De Ramos

hourCounter = 0
loop = 1
try:
    print("Type 1 for metric or 2 for english units")
    unit = (int(input("")))

    if unit == 1:
        print("Enter the speed of the vehicle in kilometers per hour (km/h)")
        speed = (int(input("")))
    elif unit == 2:
        print("Enter the speed of the vehicle in miles per hour (mp/h)")
        speed = (int(input("")))

    print("Enter the amount of hours the vehicle has traveled")
    hours = (int(input("")))

    print("")

    print("Time Spent                  Distance Traveled")
    print("_____________________________________________")

    if(unit == 1):
        while loop < hours+1:
            if(loop == 1):
                loop += 1
                hourCounter += 1
                print(hourCounter, " Hour ", "           ", (speed*hourCounter), " Kilometers")
            else:
                loop += 1
                hourCounter += 1
                print(hourCounter, " Hours ", "          ", (speed*hourCounter), " Kilometers")
    else:
        while loop < hours+1:
            if(loop == 1):
                loop +=1
                hourCounter +=1
                print(hourCounter, " Hour ", "           ", (speed*hourCounter), " Miles")
            else:
                loop +=1
                hourCounter +=1
                print(hourCounter, " Hours ", "          ", (speed*hourCounter), " Miles")
except:
    print("Invalid input. Please rerun the program")            