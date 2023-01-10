/* Written by: Dan Jandel C. De Ramos */

#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    float sugarOneCookie = 0.03125;
    float butterOneCookie = 0.02083;
    float flourOneCookie = 0.05730;
    float sugarTotal;
    float butterTotal;
    float flourTotal;
    int cookies;

    cout << endl;
    cout << "Enter the amount of cookies you wish to bake: ";
    cin >> cookies;

    sugarTotal = sugarOneCookie*cookies;
    butterTotal = butterOneCookie*cookies;
    flourTotal = flourOneCookie*cookies;

    cout << fixed;
    cout.precision(2);
    cout << endl;
    cout << "Ingredients needed for " << cookies << " pieces of cookies" << endl;
    cout << "Sugar: " << sugarTotal << " Cups" << endl;
    cout << "Butter: " << butterTotal << " Cups" << endl;
    cout << "Flour: " << flourTotal << " Cups";
    cout << endl;
}