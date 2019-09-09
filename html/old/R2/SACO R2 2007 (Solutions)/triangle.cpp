/*
 * Solution to question "Triangle" from the
 * 2007 South African Computer Olympiad
 *
 * Carl Hultquist (chultquist@gmail.com)
 */

#include <iostream>

using namespace std;

int main()
{
    int a, b, c;
    cin >> a >> b >> c;
     if ((a == b) && (b == c))
        cout << "EQUILATERAL" << endl;
    else if ((a == b) || (b == c) || (c == a))
         cout << "ISOSCELES" << endl;
    else
         cout << "SCALENE" << endl;
    return 0;
}
