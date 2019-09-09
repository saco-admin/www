#!/usr/bin/env python
# SACO 2nd Round 2008
# Checksums Solution by Keegan Carruthers-Smith

s = raw_input("Enter credit card number: ").strip()
nums = ""
for i, c in enumerate(s):
    if i % 2 == 1:
        nums += str(int(c) * 2)
    else:
        nums += c

checksum = sum(map(int, nums))
if checksum % 10 == 0:
    print checksum, "VALID"
else:
    print checksum, "INVALID"
