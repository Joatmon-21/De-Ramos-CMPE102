#include <iostream>
#include <random>

using namespace std;

void lotteryNumberGenerator(){
    int lotteryNumbers[7] = {};
    random_device randomizer; // Creating a randomizer
    uniform_int_distribution<int> lotteryNumber(0, 9); // Sets minimum and maximum value of randomizer which will be assinged to int variable lotteryNumber

    for(int loop = 0; loop < (sizeof(lotteryNumbers)/sizeof(int)); loop++){
        lotteryNumbers[loop] = lotteryNumber(randomizer);
        cout << lotteryNumbers[loop] << " ";
    }
}

int main(){
    cout << "Lottery Numbers: ";
    lotteryNumberGenerator();
}