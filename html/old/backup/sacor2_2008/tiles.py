#!/usr/bin/env python
# SACO Second Round 2008
# Problem: Tiles
# Author:  Marco Gallotta

N = input("Enter N: ")
count = [0,0,1,1]
for i in xrange(4, N+1):
    count.append((count[i-2] + count[i-3]) % 1007)
print count[N]
