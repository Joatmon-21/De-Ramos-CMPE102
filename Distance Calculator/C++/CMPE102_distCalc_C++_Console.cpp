// Written by: Dan Jandel C. De Ramos

#include <iostream>

using namespace std;

int main(){

    int hours;
    int hourCounter = 0;
    int speed = 0;
    int unit;

    cout << "Type 1 for metric or 2 for english units \n";
    cin >> unit;

    if(unit == 1){
        cout << "Enter the speed of the vehicle in kilometers per hour (km/h) \n";
        cin >> speed;
    }else if (unit == 2){
        cout<< "Enter the speed of the vehicle in miles per hour (mp/h) \n";
        cin >> speed;
    }else{
        cout << "You have entered an invalid input. Please rerun the program \n";
        exit(0);
    }

    cout << "Enter the hours the vehicle has traveled \n";
    cin >> hours;

    cout << "Time Spent                  Distance Traveled \n";
    cout << "_____________________________________________ \n";

    if (unit == 1){
        for(int loop = 1; loop < hours+1; loop++){
            if(loop == 1){
                hourCounter++;
                cout << hourCounter << " Hour" << "             " << (hourCounter*speed) << " Kilometers \n";
            }else{
                hourCounter++;
                cout << hourCounter << " Hours " << "            " << (hourCounter*speed) << " Kilometers \n";
            }            
        }
    }else{
        for(int loop = 1; loop < hours+1; loop++){
            if(loop == 1){
                hourCounter++;
                cout << hourCounter << " Hour" << "             " << (hourCounter*speed) << " Miles \n";
            }else{
                hourCounter++;
                cout << hourCounter << " Hours " << "            " << (hourCounter*speed) << " Miles \n";
            }            
        }
    }
}