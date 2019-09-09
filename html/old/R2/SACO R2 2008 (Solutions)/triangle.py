#!/usr/bin/env python
# SACO Second Round 2008
# Problem: Triangle
# Author:  Marco Gallotta

N = input("Enter N: ")
for row in xrange(N):
    for col in xrange(row+1):
        print "*",
    print ""
