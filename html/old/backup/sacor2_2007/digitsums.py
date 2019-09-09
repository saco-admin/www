#!/usr/bin/env python
# SACO 2nd Round 2007
# Solution by Marco Gallotta

N = raw_input("Enter a number: ")
while len(N) > 1:
    new_N = 0
    for digit in N:
        new_N += int(digit)
    N = str(new_N)
print "Digit sum:", N
