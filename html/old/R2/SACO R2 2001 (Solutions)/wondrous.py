# Question 1: Woundrous
# Author: Kieren Davies
number = int(raw_input("Enter number to start with: "))
n = number
reps = 0

while n != 1:
    if n % 2 == 1:
        n = 3*n + 1
    else:
        n /= 2
    reps += 1

print number, "becomes wondrous after", reps, "repetitions."
