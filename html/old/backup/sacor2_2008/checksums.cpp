// SACO 2nd Round 2008
// Checksums Solution by Keegan Carruthers-Smith

#include <iostream>
#include <string>

using namespace std;

int main() {
    string number;
    int checksum = 0;

    cout << "Enter credit card number: ";
    cin >> number;

    for (int i = 0; i < number.size(); i++) {
	if (i % 2 == 1) {
	    int k = (number[i] - '0') * 2;
	    checksum += (k % 10);
	    checksum += (k / 10);
	} else {
	    checksum += (number[i] - '0');
	}
    }

    if (checksum % 10 == 0)
	cout << checksum << " VALID" << endl;
    else
	cout << checksum << " INVALID" << endl;

    return 0;
}
