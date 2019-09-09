/**
 * Problem "Hidden Strings" for SACO 2nd round 2007. 
 * Solution by Keegan Carruthers-Smith
 */

#include <iostream>
#include <string>

using namespace std;

string sentance, search_str;

bool isLetter(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
}

inline char upper(char c) {
    if (c >= 'a' && c <= 'z')
        return c - 'a' + 'A';
    return c;
}

int find(int pos) {
    if ( upper(sentance[pos]) != upper(search_str[0]) )
        return -1;

    pos++;
    for (int i = 1; i < search_str.size(); i++, pos++) {
        // Skip non-letter
        while ( pos < sentance.size() && !isLetter(sentance[pos]) )
            pos++;

        if ( pos >= sentance.size() ) // Out of bounds
            return -1;

        if ( upper(sentance[pos]) != upper(search_str[i]) )
            return -1;
    }

    return pos;
}

int main() {
    getline(cin, sentance);
    getline(cin, search_str);

    bool found = false;

    for (int i = 0; i < sentance.size(); i++) {
        int j = find(i);
        
        if (j != -1) {
            found = true;
            cout << sentance.substr(i,j-i) << endl;
        }
    }

    if (!found)
        cout << "No strings found" << endl;        

    return 0;
}
