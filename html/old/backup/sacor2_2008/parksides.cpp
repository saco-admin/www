// SACO Second Round 2008
// Problem: Parkside's Triangle
// Author: Timothy Stranex

#include <iostream>
using namespace std;

int main()
{
  int N, S;
  cout << "Enter N: ";
  cin >> N;
  cout << "Enter S: ";
  cin >> S;

  for (int i=0; i<N; i++) {
    int pos = S + i + 8;
    for (int j=0; j<i; j++) {
      pos += j+1;
      cout << "  ";
    }
    for (int j=i; j<N; j++) {
      cout << pos%9+1 << " ";
      pos += j+1;
    }
    cout << endl;
  }

  return 0;
}
