#!/usr/bin/env python
# SACO Round 2 2007
# Solution by Marco Gallotta

W = int(raw_input("Enter width: "))
H = int(raw_input("Enter height: "))
store = [[False] * (W + 2)] 
for row in xrange(H):
    store.append([False] + map(lambda x: x == '0', raw_input("Enter row: ")) + [False])
store.append([False] * (W + 2)) 

def fill(x, y, n): 
    size = 0 
    if store[x][y] == True:
        store[x][y] = n 
        size = 1 
        for shift in [(0, -1), (0, 1), (-1, 0), (1, 0)]:
            size += fill(x + shift[0], y + shift[1], n)
    return size

(n, smallest, largest) = (0, 1000000000, 0)
for x in xrange(1, H + 1): 
    for y in xrange(1, W + 1): 
        if store[x][y] == True:
            n += 1
            size = fill(x, y, n + 1)
            smallest = min(smallest, size)
            largest  = max(largest,  size)

print "Number of rooms: %d" % n 
print "Smallest room:   %d" % smallest
print "Largest room:    %d" % largest
