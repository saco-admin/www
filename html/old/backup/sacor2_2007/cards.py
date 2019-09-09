# Solution to the problem "Cards" from the 2007 South African Computer Olympiad
#
# Timothy Stranex (timothy.stranex@gmail.com)
# 2007-04-25

print 'Enter the numbers of the cards:',
cards = map(int, raw_input().split(' '))
cards.sort()

njokers = 0
for c in cards:
    if (c == 0):
        njokers += 1

best = 0
if (njokers == len(cards)):
    best = njokers

# there is always a longest run starting on a non-joker card if there is at
# least one non-joker card
for i in range(njokers, len(cards)):
    n = 1
    nj = 0
    
    while 1:
        if ((i+n-nj < len(cards)) and (cards[i+n-nj] == cards[i]+n)):
            n += 1
        elif (nj < njokers):
            n += 1
            nj += 1
        else:
            break
    
    best = max(best, n)

print 'The longest run has length %d.' % best
