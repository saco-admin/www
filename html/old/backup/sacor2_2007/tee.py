#!/usr/bin/env python
# SACO 2nd Round 2007
# Solution by Marco Gallotta

N = int(raw_input("Enter N: "))
print "\n".join(["t" * N] + [" " * (N/2) + "t"] * (N-1))
