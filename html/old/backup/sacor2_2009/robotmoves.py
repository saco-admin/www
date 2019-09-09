#!/usr/bin/env python
# SACO Second Round 2009
# Problem: Robot Moves
# Author:  Michiel Baird

M = int(raw_input("Enter the width M: "))
N = int(raw_input("Enter the height N: "))

instructions = raw_input("Enter the initial instructions: ")
# The worst starting positions are on the sides
# Simulate those 4 then take the best moves to a corner
bottom = N-1
top = 0
left = 0
right = M-1
for i in instructions:
    if i == 'd':
        top += 1
        bottom += 1
        top = min(N-1,top)       # Ignored instruction
        bottom = min(N-1,bottom) # Ignored instruction
    elif i == 'u':
        top -= 1
        bottom -= 1
        top = max(0,top)         # Ignored instruction
        bottom = max(0,bottom)   # Ignored instruction
    elif i == 'r':
        left += 1
        right += 1
        left = min(M-1,left)     # Ignored instruction
        right = min(M-1,right)   # Ignored instruction
    elif i == 'l':
        left -= 1
        right -= 1
        left = max(0,left)       # Ignored instuction
        right = max(0,right)     # Ignored instuction

# From the worst starting positions is it the best to go up or down and left or right
if top == bottom: bottom = 0 # If the worst possible is the same no vertical instructions are necessary
if left == right: right = 0      ## If the worst possible is the same no horizontal instructions are necessary
movesreq = min(bottom ,N - top - 1) + min(right ,M - left - 1)
print "You need to issue a further %d instructions." % movesreq
