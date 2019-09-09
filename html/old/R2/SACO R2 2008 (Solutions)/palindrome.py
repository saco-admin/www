#/usr/bin/env python
# SACO 2nd Round 2008
# Palindrome - Keegan and Ben

num = raw_input("Enter number: ")
i = 0
reverse = lambda x: "".join(reversed(x))
 
while num != reverse(num) and i <= 100:
    num = str( int(num) + int(reverse(num)) )
    i+=1

if i > 100:
    print "DOES NOT TERMINATE"
else:
    print i, num
