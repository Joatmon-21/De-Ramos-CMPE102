# Written by: Dan Jandel C. De Ramos

print ("Please enter the area of the wall in square feet")
wallArea = (float(input("")))
print ("Please enter the cost of the paint per gallon")
paintPrice = (float(input("")))

paintGallon = wallArea/115 # 115sqft : 1 Gallon of Paint 
totalLaborTime = paintGallon*8 # 1 Gallon of Paint : 8 Hours of Labor
paintCost = paintGallon*paintPrice
laborCost = totalLaborTime*20 # 8 Hours of Labor : 20 Dollars
totalCost = laborCost + paintCost

laborTimeHoursInt = (int(totalLaborTime))
laborTimeMinutesFloat = (float(totalLaborTime - laborTimeHoursInt))
laborTimeMinutesInt = (int(60*laborTimeMinutesFloat))

paintCostString = "{:.2f}".format(paintCost)
paintGallonString = "{:.2f}".format(paintGallon)
laborCostString = "{:.2f}".format(laborCost)
totalCostString = "{:.2f}".format(totalCost)

print()
if(paintGallon == 1):
    print("Gallons of paint required: " + paintGallonString + " gallon of paint")
else:
    print("Gallons of paint required: " + paintGallonString + " gallons of paint")

if(laborTimeMinutesInt == 0):
    print("It will take" , laborTimeHoursInt , "Hours")
else:
    print("It will take" , laborTimeHoursInt , "Hours and" , laborTimeMinutesInt , "Minutes")
print("The paint will cost $" + paintCostString)
print("The labor will cost $" + laborCostString + " at a rate of $20 per hour")
print("Your total cost equates to $"+ totalCostString)