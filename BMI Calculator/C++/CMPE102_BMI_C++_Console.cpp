/* Written by: Dan Jandel C. De Ramos
 * Data for BMI Ratings obtained from: https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
 * Data for BMI formulas obtained from: https://www.bmi-calculator.net/bmi-formula.php
 */

#include <iostream>
#include <iomanip>
#include <math.h>

calculateMetric(double weight, double height){
    return weight / (pow(height/100, 2));
}

calculateEnglish(double weight, double height){
    return (weight / (pow(height,2)))*703;
}

using namespace std;

int main(){

    int unit;
    double weight;
    double height;
    double bmi;
    string bmiRating;

    cout << "Type 1 for metric or 2 for english units" <<endl;
    cin >> unit;
    cout << endl;

    if(unit == 1){

        cout << "Enter your weight in kilograms (kg)" << endl;
        cin >> weight;
        cout << endl;

        cout << "Enter your height in centimeterse (cm)" << endl;
        cin >> height;
        cout << endl;

        bmi = calculateMetric(weight, height);

        if(bmi <= 18.5){
            bmiRating = "Underweight";
        }else if(bmi >= 18.6 && bmi <= 24.9){
            bmiRating = "Normal";
        }else if(bmi >= 25.0 && bmi <= 29.9){
            bmiRating = "Overweight";
        }else if(bmi >= 30){
            bmiRating = "Obese";
        }

    }else if(unit == 2){
        
        cout << endl;
        cout << "Enter your weight in pounds (lb)" << endl;
        cin >> weight;
        cout << endl;

        cout << "Enter your height in inches (in)" << endl;
        cin >> height;
        cout << endl;

        bmi = calculateEnglish(weight, height);
    }else{
        cout << "You have entered an invalid input. Please rerun the program";
        exit(0);
    }


    if(bmi <= 18.5){
        bmiRating = "Underweight";
    }else if(bmi >= 18.6 && bmi <= 24.9){
        bmiRating = "Normal";
    }else if(bmi >= 25.0 && bmi <= 29.9){
        bmiRating = "Overweight";
    }else if(bmi >= 30){
        bmiRating = "Obese";
    }
            
        cout << fixed;
        cout.precision(2);
        cout << "Your BMI is: " << bmi << endl;
        cout << "Your BMI Rating is: " << bmiRating;

}
