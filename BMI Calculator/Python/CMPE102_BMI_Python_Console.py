# Written by: Dan Jandel C. De Ramos
# Data for BMI Ratings obtained from: https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
# Data for BMI formulas obtained from: https://www.bmi-calculator.net/bmi-formula.php

def calculateMetric(weight, height):
    return weight/((height/100)**2)
def calculateEnglish(weight, height):
    return (weight/(height**2))*703

try:
    print("Type 1 for metric or 2 for english units")
    unit = (int(input("")))
    print("")

    if unit == 1:
        print("Enter your weight in kilograms (kg)")
        weight = (float(input("")))
        print("")
        print("Enter your height in centimeters (cm)")
        height = (float(input("")))
        print("")
        bmi = calculateMetric(weight, height)

    elif unit == 2:
        print("Enter your weight in pounds (lb)")
        weight = (float(input("")))
        print("")
        print("Enter your height in inches (in)")
        height = (float(input("")))
        print("")
        bmi = calculateEnglish(weight, height)

    if(bmi <= 18.5):
        bmiRating = "Underweight"
    elif(bmi >= 18.6 and bmi <= 24.9):
        bmiRating = "Normal"
    elif(bmi >= 25.0 and bmi <= 29.9):
        bmiRating = "Overweight"
    elif(bmi >= 30):
        bmiRating = "Obese"

    bmiString = "{:.2f}".format(bmi)
    print("Your BMI is:", bmiString)
    print("Your BMI Rating is:", bmiRating)
except:
    print("You have entered an invalid input. Please rerun the program")
