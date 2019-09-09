// SACO 2nd Round 2007
// DigitSum solution by Bruce Merry
#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Enter a positive integer: " << flush;
    cin >> n;
    cout << "Digit sum: ";
    if (n != 0 && n % 9 == 0) cout << "9\n";
    else cout << n % 9 << "\n";
    return 0;
}
