# Written by: Dan Jandel C. De Ramos

def calculatePaintGallon(wallArea):
    return wallArea/115 # 115sqft : 1 Gallon of Paint 
def calculateTotalLaborTime(paintGallon):
    return paintGallon*8 # 1 Gallon of Paint : 8 Hours of Labor
def calculateTotalLaborCost(totalLaborTime):
    return totalLaborTime*20 # 8 Hours of Labor : 20 Dollars

print ("Enter the area of the wall (Square Feet)")
wallArea = (float(input("")))
print ("Enter the price of the paint per gallon (USD)")
paintPrice = (float(input("")))
print()

paintGallon = calculatePaintGallon(wallArea)
totalLaborTime = calculateTotalLaborTime(paintGallon)
paintCost = paintGallon*paintPrice
laborCost = calculateTotalLaborCost(totalLaborTime)
totalCost = laborCost + paintCost

laborTimeHoursInt = (int(totalLaborTime)) # Converting to Int to obtain the whole number or hours only
laborTimeMinutesFloat = (float(totalLaborTime - laborTimeHoursInt)) # Subtracting the whole number from the total to obtain minutes
laborTimeMinutesInt = (int(60*laborTimeMinutesFloat)) # Converting minutes from decimal form in hours into minutes

paintCostString = "{:.2f}".format(paintCost)
paintGallonString = "{:.2f}".format(paintGallon)
laborCostString = "{:.2f}".format(laborCost)
totalCostString = "{:.2f}".format(totalCost)

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
print("Your total cost equates to: $"+ totalCostString)