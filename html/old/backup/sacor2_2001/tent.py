# Question 2: Tent
# Authoer: Greg Jackson
N = int(raw_input("Enter N: "))
a=0
b=0
if N %3!=1:
    print "Unable to draw a triangle of this size!"
else:
    table = [[' ']*(2*N-1) for x in range(N)]
    for i in table:
        if a == (N-1):
            for p in range(N):
                i[2*p]='*'
        elif a >= N-((N+2)/3):
            i[(2*N-1)/2-a]='*'
            i[(2*N-1)/2+a]='*'
            i[(2*N-1)/2-b]='*'
            i[(2*N-1)/2+b]='*'
            b+=1
        else:
            i[(2*N-1)/2-a]='*'
            i[(2*N-1)/2+a]='*'
        a+=1
        if a == N:
            for z in range((N+2)/3-1):
                i[(2*N-1)/2-z]=' '
                i[(2*N-1)/2+z]=' '
    table[-1]
    for row in table:
        print ''.join(row)
