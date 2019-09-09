#!/usr/bin/env python
# Keegan Carruthers-Smith - Fizzbuzz - SACO R2 2010

N = int(raw_input('Count to what number? '))
for i in range(1, N+1):
    mul_three = i % 3 == 0
    mul_five  = i % 5 == 0
    if mul_three and mul_five:
        print 'fizzbuzz'
    elif mul_five:
        print 'buzz'
    elif mul_three:
        print 'fizz'
    else:
        print i
