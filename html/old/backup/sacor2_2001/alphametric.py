# Question 5: Alphametric
# Author: Marco Gallotta

words = [raw_input().strip() for i in xrange(3)]
letters, non_zero = [], []
for word in words:
  for c in word:
    letters.append(c)
  non_zero.append(word[0])
letters = list(set(letters))

num_solutions = 0
used = [False] * 10
digits = [None] * len(letters)

def valueof(word):
  value = 0
  for l in word:
    p = letters.index(l)
    value = value*10 + digits[p]
  return value

def check():
  global num_solutions
  if valueof(words[0]) + valueof(words[1]) == valueof(words[2]):
    num_solutions += 1
    print "A solution is: %s" % "; ".join(["%s=%d" % (l, d) for l, d in zip(letters, digits)])

def solve(pos = 0):
  if pos == len(letters):
    check()
    return
  for digit in xrange(10):
    if digit == 0 and letters[pos] in non_zero:
      continue  # first digit of a number must be non-zero
    if not used[digit]:
      used[digit] = True
      digits[pos] = digit
      solve(pos+1)
      used[digit] = False

solve()
print "There are %d solutions to this sum." % num_solutions
