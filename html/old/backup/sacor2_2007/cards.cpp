/*
 * Solution to the problem "Cards" from the
 * 2007 South African Computer Olympiad
 *
 * Timothy Stranex <timothy.stranex@gmail.com>
 * 2007-04-25
 */

#include <algorithm>
#include <vector>
#include <iostream>
#include <sstream>
using namespace std;

int main(int argc, char *argv[])
{
    vector<int> cards;

    cout << "Enter the numbers of the cards: ";
    string line;
    getline(cin, line);

    istringstream is(line);
    {
        int n;
        while (is >> n) {
            cards.push_back(n);
        }
    }
    sort(cards.begin(), cards.end());
    int N = cards.size();

    int njokers = 0;
    for (int i=0; i<N; i++) {
        if (cards[i] == 0) {
            njokers++;
        }
    }

    int best = 0;
    if (njokers == N) {
        best = N;
    }

    // there is always a longest run starting on a non-joker card if there is
    // at least one non-joker card
    for (int i=njokers; i<N; i++) {
        int n = 1;
        int nj = 0;

        while(true) {
            if ((i+n-nj < N) && (cards[i+n-nj] == cards[i]+n)) {
                n++;
            } else if (nj < njokers) {
                n++;
                nj++;
            } else {
                break;
            }
        }

        best = max(best, n);
    }

    cout << "The longest run has length " << best << "." << endl;

    return 0;
}
