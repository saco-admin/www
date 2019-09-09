#!/usr/bin/env python
# SACO Second Round 2009
# Problem: Arithmetic Progression
# Author:  Marco Gallotta

N = int(raw_input("Enter N: "))
num = [int(raw_input("Enter a number: ")) for i in xrange(N)]
num.sort()
longest, count = [], 0
for i, first in enumerate(num):
  for j, second in enumerate(num[i+1:]):
    d = second - first
    seq = [first, second]
    for n in num[j+1:]:
      if n == first + d * len(seq):
        seq.append(n)
    if len(seq) > len(longest):
      longest, count = seq, 1
    elif len(seq) == len(longest):
      count += 1
print "Arithmetic Progression Length =",            len(longest)
print "Number of Arithmetic Progressions =",        count
print "Arithmetic Progression First Term =",        longest[0]
print "Arithmetic Progression Common Difference =", longest[1] - longest[0]
