// SACO 2nd Round 2007
// Rooms solution by Keegan Carruthers-Smith

#include <iostream>
#include <algorithm>

using namespace std;

bool seen[22][22]; // True if inspected cell
bool grid[22][22]; // False if wall. Grid is surrounded by walls for sentinals
int delta[4][2] = { {1,0}, {0,1}, {-1,0}, {0,-1} };

int dfs(int x, int y) {
    if ( seen[x][y] || !grid[x][y] )
        return 0;

    seen[x][y] = true;
    int sum = 1;
    for (int i = 0; i < 4; i++)
        sum += dfs( x + delta[i][0], y + delta[i][1] );

    return sum;
}

int main() {
    int width, height;
    int small, big, nRooms;
    char buf [21];
    
    big = nRooms = 0;
    small = 20*20;

    cout << "Enter width:  ";
    cin >> width;
    cout << "Enter height: ";
    cin >>  height;

    for (int x = 1; x <= height; x++) {
        cout << "Enter row: ";
        cin >> buf;
        for (int y = 1; y <= width; y++)
            grid[x][y] = buf[y-1] != '1';
    }

    for (int x = 1; x <= height; x++) {
        for (int y = 1; y <= width; y++) {
            int size = dfs(x,y);

            if (size != 0) {
                small = min(small, size);
                big   = max(big,   size);
                nRooms++;
            }
        }
    }

    cout << "Number of rooms: " << nRooms << endl;
    cout << "Smallest room:   " << small << endl;
    cout << "Largest room:    " << big << endl;
    
    return 0;
}
