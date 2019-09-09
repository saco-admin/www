#!/usr/bin/env python
# SACO 2nd Round 2007
# Solution by Marco Gallotta

a = int(raw_input("Enter a: "))
b = int(raw_input("Enter b: "))
c = int(raw_input("Enter c: "))
if a == b == c:
    print "EQUILATERAL"
elif a == b or b == c or c == a:
    print "ISOSCELES"
else:
    print "SCALENE"
