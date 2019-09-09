# Qeustion 3: Primes
# Author: Sean Wentzel
n=int(raw_input("Enter a number between 2 and 1000: "))
orig=n
pfact=[]
for x in xrange(2,n+1):
    while n%x==0:
        n/=x
        pfact.append(x)
for x in range(len(pfact)):
    pfact[x]=str(pfact[x])
out=" x ".join(pfact)
print orig, "=", out
