#!/usr/bin/env python
# Keegan Carruthers-Smith - Palin - SACO R2 2010

word = raw_input('Enter the word you wish to see if it is a Palindrome? ')
if word == word[::-1]:
    print 'Is a Palindrome'
else:
    print 'Is Not a Palindrome'
