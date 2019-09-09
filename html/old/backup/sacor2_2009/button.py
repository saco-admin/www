#!/usr/bin/env python
# SACO Second Round 2009
# Problem: Unmarked Calculator Button
# Author:  Michiel Baird

a = int(raw_input("First Number: "))
b = int(raw_input("Second Number: "))
c = int(raw_input("Answer: "))
if a+b == c:
    if a*b == c:
        print "Either Plus or Times"
    else:
        print "Plus only"
elif a*b == c:
    print "Times only"
else:
    print "Neither Plus nor Times"
print "%d+%d=%d" % (a,b,a+b)
print "%dx%d=%d" % (a,b,a*b)
