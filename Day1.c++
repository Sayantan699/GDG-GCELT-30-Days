/*
    Swap 1 1

    Write a Program to swap two integer numbers without using 3rd Variable.

    Don't use functions

*/
#include <iostream>
using namespace std;
int main()
{
    int n1, n2;
    cout << "Enter number 1: ";
    cin >> n1;
    cout << "Enter number 2: ";
    cin >> n2;
    n1 = n1 + n2;
    n2 = n1 - n2;
    n1 = n1 - n2;
    cout << n1 << " " << n2;
}