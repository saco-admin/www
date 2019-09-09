#!/usr/bin/env python
# SACO Round 2 2007
# Solution by Marco Gallotta

N = int(raw_input())
A = []
for i in xrange(N):
    A.append(int(raw_input()))

ans = 0 
for dom in xrange(N):
    knocked = [False] * N 
    num = 0 
    while not knocked[dom]:
        knocked[dom] = True
        num += 1
        dom = (dom + A[dom]) % N 
    if num == N:
        ans += 1

print ans
