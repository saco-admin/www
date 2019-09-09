// SACO 2nd Round 2008
// Triangle - Josh Yudaken
#include <iostream>
using namespace std;
int main() {
    int N;
    cout << "Enter N: ";
    cin >> N;
    for (int k=0; k<N; k++) {
        for (int j=0; j<k; j++) cout << "* ";
        cout << '*' << endl;
    }
    return 0;
}
