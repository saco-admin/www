#!/usr/bin/env python
# SACO 2nd Round 2008
# Solution by Richard Baxter
import math 
a = int(raw_input("Enter a: ")) 
b = int(raw_input("Enter b: "))
c = int(raw_input("Enter c: "))
s = 1.0*(a+b+c)/2
print math.sqrt(s*(s-a)*(s-b)*(s-c))
