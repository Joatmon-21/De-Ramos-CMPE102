# Written by: Dan Jandel C. De Ramos

print("Please type 1 for metric and 2 for english units")
unit = (int(input("")))

if unit == 1:
    print("Enter your weight in kilograms (kg)")
    weight = (float(input("")))

    print("Enter your height in centimeters (cm)")
    height = (float(input("")))
    print("")

    bmi = weight/((height/100)**2)


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
    print("You are:", bmiRating)
elif unit == 2:
    print("Enter your weight in pounds (lb)")
    weight = (float(input("")))
    print("")

    print("Enter your height in inches (in)")
    height = (float(input("")))
    print("")

    bmi = (weight/(height**2))*703

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
    print("You are:", bmiRating)