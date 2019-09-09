// SACO 2nd Round 2008
// Heron's Formula Solution - Keegan Carruthers-Smith

#include <cmath>
#include <iostream>

using namespace std;

int main() {
    int a,b,c;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;
    cout << "Enter c: ";
    cin >> c;
    double s = (a+b+c)/2.0;
    cout << sqrt(s * (s-a) * (s-b) * (s-c)) << endl;
    return 0;
}
