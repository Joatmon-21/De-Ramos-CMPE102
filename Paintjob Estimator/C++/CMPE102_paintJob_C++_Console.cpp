/* Written by: Dan Jandel C. De Ramos*/

#include <iostream>
#include <iomanip>

using namespace std;

double calculatePaintGallon(double wallArea){
    return wallArea/115; /* 115sqft : 1 Gallon of Paint */
}

double calculateTotalLaborTime(double paintGallon){
    return paintGallon*8; /* 1 Gallon of Paint : 8 Hours of Labor */
}

double calculateTotalLaborCost(double totalLaborTime){
    return totalLaborTime*20; /* 8 Hours of Labor : 20 Dollars */
}

int main(){

    int laborTimeHoursInt;
    int laborTimeMinutesInt;
    double wallArea;
    double laborCost;
    double laborTimeMinutesDouble;
    double totalLaborTime;
    double paintGallon;
    double paintCost;
    double paintPrice;
    double totalCost;

    cout << "Enter the area of the wall (Square Feet)" << endl;
    cin >> wallArea;
    cout << "Enter the price of the paint per gallon (USD)" << endl;
    cin >> paintPrice;
    cout << endl;

    paintGallon = calculatePaintGallon(wallArea);
    totalLaborTime = calculateTotalLaborTime(paintGallon);
    paintCost = paintGallon*paintPrice;
    laborCost = calculateTotalLaborCost(totalLaborTime);
    totalCost = laborCost + paintCost;

    laborTimeHoursInt = static_cast<int>(totalLaborTime); /* Converting to Int to obtain the whole number or hours only */
    laborTimeMinutesDouble = static_cast<double>((totalLaborTime - laborTimeHoursInt)); /* Subtracting the whole number from the total to obtain minutes */
    laborTimeMinutesInt = static_cast<int>((60*laborTimeMinutesDouble)); /* Converting minutes from decimal form in hours into minutes */

    cout << fixed;
    cout.precision(2);

    if(paintGallon == 1){
        cout << "Gallons of paint required: " << paintGallon << " gallon of paint" << endl;    
    }else{
        cout << "Gallons of paint required: " << paintGallon << " gallons of paint" << endl;
    }
    
    cout << "It will take " << laborTimeHoursInt << " Hours";
    if(laborTimeMinutesInt == 0){
        cout << endl;
    }else{
        cout << " and " << laborTimeMinutesInt << " Minutes" << endl;
    }

    cout << "The paint will cost $" <<paintCost << endl;
    cout << "The labor will cost $" <<laborCost << " at a rate of $20 per hour" << endl;
    cout << "Your total cost equates to : $" << totalCost;
}