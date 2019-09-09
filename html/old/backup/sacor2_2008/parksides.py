#!/usr/bin/env python
# SACO 2nd Round 2008
# Parkside Triangle Solution by Keegan Carruthers-Smith

N = int(raw_input("Input N: "))
S = int(raw_input("Input S: "))

table = [[' ']*N for n in range(N)]

for i in range(N):
    for j in range(i+1):
        table[j][i] = str(S)
        S = (S % 9) + 1

for row in table:
    print ' '.join(row)
