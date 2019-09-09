/* 
Solution for 'Tee', problem 1 of SACO 
Junior 2nd Round 2007
By Ben Steenhuisen
*/
#include <iostream>
using namespace std;
int main()
{
   int n,x,y;
   cout << "Enter N:  ";
   cin >> n;
   for (x=0;x<n;x++)
   {
       cout << 't';
   }
   cout << endl;
   for (y=1;y<n;y++)
   {
       for (x=0;x<((n-1)/2);x++)
       {
            cout << ' ';
       }
       cout << 't' << endl;
   }
   return 0;
}
