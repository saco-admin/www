#!/usr/bin/env python
# Keegan Carruthers-Smith - Unaran Messages - SACO R2 2010

cache = {}
def count_sentances(num_blocks, largest_word):
    if (num_blocks, largest_word) in cache:
        return cache[(num_blocks, largest_word)]
    elif num_blocks > 0 and largest_word == 1:
        return 1
    elif num_blocks == 0:
        return 1
    elif num_blocks <= 0:
        return 0

    ans = 0
    for blocks_in_word in range(1, min(largest_word, num_blocks) + 1):
        ans = ans + count_sentances(num_blocks - blocks_in_word, blocks_in_word)
    cache[(num_blocks, largest_word)] = ans % 10007
    return ans % 10007

N = int(raw_input('How many letters in the message? '))
print count_sentances(N, N)
