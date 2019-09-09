# Prime paths solution in Python
# by Max Rabkin

def isPrime (n):
    for i in range(2, n):
        if n % i == 0:
            # i is a factor of n, so n is not prime
            return False
    else:
        return True

def canGoFromTo (A, B):
    return len([1 for a, b in zip(A, B) if a != b]) == 1

def bfs (start, dest):
    visited = dict((p, False) for p in primes)
    visited[start] = True

    q = [(start,)]

    while q:
        path = q.pop(0)
        cur = path[-1]

        if cur == dest:
            return path

        for p in primes:
            if canGoFromTo(cur, p) and not visited[p]:
                q.append(path + (p,))

start = raw_input("What number did Hannah start with? ")
end = raw_input("What number does she want to end on? ")
digits = len(start)
primes = map(str, filter(isPrime, range(10**(digits-1), 10**digits-1)))

for p in bfs(start, end):
    print p
