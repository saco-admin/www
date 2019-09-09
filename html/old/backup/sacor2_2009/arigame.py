# SACO Second Round 2009
# Problem: Arithmetic Game
# Author:  Max Rabkin

def sublistsC (seq):
    """Find all the sublists with their complements."""
    if seq:
        sublists = [([seq[0]] + a, b) for a, b in sublistsC(seq[1:])]
        return sublists + [(b, a) for a, b in sublists]
    else:
        return [([], [])]

def allValues (seq):
    if len(seq) == 1:
        yield seq[0]
        return

    for left, right in sublistsC(seq):
        if left == [] or right == []:
            continue

        for lvalue in allValues(left):
            for rvalue in allValues(right):
                yield lvalue + rvalue
                yield lvalue * rvalue

nums = map(int, raw_input("What numbers do you have? ").split())
answers = set(allValues(nums))
print "You can form", len(answers), "numbers"
print "Their sum is", sum(answers)
