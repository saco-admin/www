#!/usr/bin/env python
# Keegan Carruthers-Smith - Mansion - SACO R2 2010

line = raw_input('How many rows and columns are there? ')
rows, cols = map(int, line.split())

print 'Enter the mansion one row per line:'
mansion = []
for r in range(rows):
    mansion.append(list(raw_input()))
    if 'S' in mansion[-1]:
        row, col = r, mansion[-1].index('S')

delta_walk = [(r, c) for r in range(-2, 3) for c in range(-2, 3)
              if 0 < abs(r) + abs(c) <= 2]
delta_light = [(r, c) for r in range(-1, 2) for c in range(-1, 2)]
valid_coord = lambda r, c : 0 <= r < rows and 0 <= c < cols

lights_switched = 0
seen = set([(row, col)])
queue = [(row, col)]
while queue:
    row, col = queue.pop()

    if mansion[row][col] in 'S*':
        for r, c in delta_light:
            r, c = row + r, col + c
            if valid_coord(r, c) and mansion[r][c] == '.':
                mansion[r][c] = '$'
        if mansion[row][col] == '*':
            lights_switched += 1
        mansion[row][col] = '$'

    for r, c in delta_walk:
        r, c = row + r, col + c
        if valid_coord(r, c) and (r,c ) not in seen and mansion[r][c] != '.':
            seen.add((r, c))
            queue.append((r, c))

print 'I can switch on %d lights.' % lights_switched
