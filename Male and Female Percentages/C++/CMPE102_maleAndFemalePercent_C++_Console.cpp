/* Written by: Dan Jandel C. De Ramos */

#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    int maleAmount;
    int femaleAmount;
    int total;
    float malePercent;
    float femalePercent;

    cout << "Enter the amount of male students in the class: ";
    cin >> maleAmount;
    cout << "Enter the amount of female students in the class: ";
    cin >> femaleAmount;
    
    total = maleAmount + femaleAmount;
    malePercent = static_cast<float>(maleAmount)/static_cast<float>(total)*100;
    femalePercent = static_cast<float>(femaleAmount)/static_cast<float>(total)*100;

    cout << fixed;
    cout.precision(2);
    cout << "Total Number of Students: " << total << endl;
    cout << "Male Students: " << maleAmount << " / " << total << endl;
    cout << "Female Students: " << femaleAmount << " / " << total << endl;
    cout << "Percentage of Male Students: " << malePercent << " %" << endl;
    cout << "Percentage of Female Students: " << femalePercent << " %";
    return 0;
}