#!/usr/bin/env python
# SACO Second Round 2009
# Problem: Bar Graph
# Author:  Marco Gallotta

num = raw_input("Enter the number: ")
for digit in num:
  print digit, "*" * int(digit)
