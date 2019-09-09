// SACO Second Round 2008
// Problem: Palindrome
// Author:  Julian Kenwood
#include <iostream>
using namespace std;
int main() {
    int N;
    cout << "Enter N: ";
    cin >> N;
    for(int i = 0; i <= 100; ++i) {
        int rev = 0;
        int temp = N;
        while(temp != 0) {
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        if(N == rev) {
            cout << i << " " << N << endl;
            return 0;
        }
        N+=rev;
   }
   cout << "DOES NOT TERMINATE" << endl;	
   return 0;
}
