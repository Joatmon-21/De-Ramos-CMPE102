// I really need to study exception handling, otherwise infinite loop when inputting other data types -Jandel

#include <iostream>

using namespace std;

int main(){

    int loop = 0;
    int userInput;

    do{
                cout << "Select a Planet \n"; 
                cout << "1. Mercury \n";
                cout << "2. Venus \n";
                cout << "3. Earth \n";
                cout << "4. Mars \n";
                cout << "5. Exit the program \n";
                cout << "Enter your selection: ";
                cin >> userInput;

                if(userInput == 1){
                    cout << "\n";
                    cout << "Mercury \n";
                    cout << "Average distance from the sun: 57.9 million kilometers \n";
                    cout << "Mass: 31 x 10^23kg \n";
                    cout << "Surface temperature: -173 to 430 degrees Celsius \n";
                    cout << "\n";
                    continue;
                }else if(userInput == 2){
                    cout << "\n";
                    cout << "Venus \n";
                    cout << "Average distance from the sun: 108.2 million kilometers \n";
                    cout << "Mass: 4.87 x 10^24kg \n";
                    cout << "Surface temperature: 472 degrees Celsius \n";
                    cout << "\n";
                    continue;
                }else if(userInput == 3){
                    cout << "\n";
                    cout << "Earth \n";
                    cout << "Average distance from the sun: 149.6 million kilometers \n";
                    cout << "Mass: 5.967 x 10^24kg \n";
                    cout << "Surface temperature: -50 to 50 degrees Celsius \n";
                    cout << "\n";
                    continue;
                }else if(userInput == 4){
                    cout << "\n";
                    cout << "Mars \n";
                    cout << "Average distance from the sun: 227.9 million kilometers \n";
                    cout << "Mass: 0.6424 x 10^24kg \n";
                    cout << "Surface temperature: -140 to 20 degrees Celsius \n";
                    cout << "\n";
                    continue;
                }else if(userInput == 5){                    
                    loop = 1;
                }else{
                    cout << "\n";
                    cout << "!!! You have entered an invalid input. Please select a number from 1 to 5 only !!! \n";
                    cout << "\n";
                }

    }while(loop == 0);

}