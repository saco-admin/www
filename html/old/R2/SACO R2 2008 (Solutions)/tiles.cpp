// SACO 2nd Round 2008
// Tiles Solution by Keegan Carruthers-Smith

#include <iostream>

using namespace std;

int main() {
    int N;

    cout << "Enter N: ";
    cin >> N;

    int *nTiles = new int[N+1];
    nTiles[0] = 0;
    nTiles[1] = 0;
    nTiles[2] = 1;
    nTiles[3] = 1;
    
    for (int i = 4; i <= N; i++)
	nTiles[i] = (nTiles[i-2] + nTiles[i-3]) % 1007;

    cout << nTiles[N] << endl;

    delete[] nTiles;

    return 0;
}
