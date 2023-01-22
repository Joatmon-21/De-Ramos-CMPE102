/* Written by: Dan Jandel C. De Ramos*/

#include <iostream>
#include <iomanip>

using namespace std;

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

    cout << "Please enter the area of the wall in square feet" << endl;
    cin >> wallArea;
    cout << "Please enter the cost of the paint per gallon" << endl;
    cin >> paintPrice;

    paintGallon = wallArea/115; /* 115sqft : 1 Gallon of Paint */
    totalLaborTime = paintGallon*8; /* 1 Gallon of Paint : 8 Hours of Labor */
    paintCost = paintGallon*paintPrice;
    laborCost= totalLaborTime*20; /* 8 Hours of Labor : 20 Dollars */
    totalCost = laborCost + paintCost;

    laborTimeHoursInt = static_cast<int>(totalLaborTime);
    laborTimeMinutesDouble = static_cast<double>((totalLaborTime - laborTimeHoursInt));
    laborTimeMinutesInt = static_cast<int>((60*laborTimeMinutesDouble));

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
    cout << "The labor will cost $" <<laborCost << endl;
    cout << "Your total cost equates to $" << totalCost;
}