// SACO 2nd Round 2007
// Dominoes solution by Keegan Carruthers-Smith

#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

int main() {
    int N;
    int a[100];
    int superDominoes = 0;

    cin >> N;
    for (int n = 0; n < N; n++)
        cin >> a[n];

    for (int n = 0; n < N; n++) {
        bool seen[N];
        fill(seen, seen + N, false);

        int knockedOver = 0;
        int pos = n;        
        while (!seen[pos]) {
            seen[pos] = true;
            knockedOver++;
            pos = (pos + a[pos]) % N;
        }

        if (knockedOver == N)
            superDominoes++;
    }

    cout << superDominoes << endl;

    return 0;
}
