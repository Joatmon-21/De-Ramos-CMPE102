// !!! UNFINISHED !!!
// Still needs work on the exception handling, nakakabaliw ka C++ maya ka na -Jandel

#include <iostream>

using namespace std;

static int result(int base, int exponent){
    if(exponent == 0){
            // Any number raised to 0 will always be 1
            return 1;
        }else{
            // Base multiplied by itself by means of recursion based on the exponent
            return base * result(base, exponent-1);
        }
}

int main(){
    // Variable Declaration & Assignment
    int baseNum;
    int exponentNum;

        // Obtaining user input for the base number
        cout << "Enter the base: ";
        cin >> baseNum;

        // Obtaining user input for the exponent
        cout << "Enter the exponent: ";
        cin >> exponentNum;

        // Calling the function to obtain the result
        result(baseNum, exponentNum);

        // Displaying the result of the operation
        cout << "Result: " << result(baseNum, exponentNum);  
}

