# Question 4: Noughts and crosses
# Author: Charl du Plessis
r = int(raw_input("Enter number of rows: "))
c = int(raw_input("Enter number of columns: "))
print "Enter noughts and crosses"

grid = [[-1]*c for i in xrange(r)]

for i in xrange(r):
    row = raw_input()
    for j in xrange(c):
        if row[j] == "O":
            grid[i][j] = 0
        else:
            grid[i][j] = 1

leng = [0,0]
pos = [(0,0),(0,0)]
typ = ["H", "H"]

def hor(i,j,num):
    global grid, leng, pos, typ, r, c
    tmp = 1
    k = j+1
    while k < c and grid[i][k] == num:
        tmp += 1
        k += 1
    if tmp > leng[num]:
        leng[num] = tmp
        pos[num] = (i,j)
        typ[num] = "H"

def ver(i,j,num):
    global grid, leng, pos, typ, r, c
    tmp = 1
    k = i+1
    while k < r and grid[k][j] == num:
        tmp += 1
        k += 1
    if tmp > leng[num]:
        leng[num] = tmp
        pos[num] = (i,j)
        typ[num] = "V"

def D1(i,j,num):
    global grid, leng, pos, typ, r, c
    tmp = 1
    k = i+1
    m = j+1
    while k < r and m < c and grid[k][m] == num:
        tmp += 1
        k += 1
        m += 1
    if tmp > leng[num]:
        leng[num] = tmp
        pos[num] = (i,j)
        typ[num] = "D1"

def D2(i,j,num):
    global grid, leng, pos, typ, r, c
    tmp = 1
    k = i+1
    m = j-1
    while k < r and m >= c and grid[k][m] == num:
            tmp += 1
            k += 1
            m -= 1
    if tmp > leng[num]:
        leng[num] = tmp
        pos[num] = (i,j)
        typ[num] = "D2"

for i in xrange(r):
    for j in xrange(c):
        num = grid[i][j]
        hor(i,j,num)
        ver(i,j,num)
        D1(i,j,num)
        D2(i,j,num)
        

for i in xrange(r):
    for j in xrange(c):
        if grid[i][j] == 0:
            grid[i][j] = "O"
        else:
            grid[i][j] = "X"


def test(leng,pos,typ,num):
    i = pos[0]
    j = pos[1]
    if typ == "H":
        for k in xrange(j,leng):
            grid[i][k] = num
    elif typ == "V":
        for k in xrange(i,leng):
            grid[k][j] = num
    elif typ == "D1":
        for k in xrange(i,leng):
            grid[i+k][j+k] = num
    else:
        for k in xrange(i,leng):
            for m in xrange(j,leng):
                grid[i+k][j-k] = num

def Pgrid(grid):
    global r,c
    for i in xrange(r):
        out = ""
        for j in xrange(c):
            out += grid[i][j]
        print out


        

if leng[0] > leng[1]:
    test(leng[0],pos[0],typ[0],"1")
    Pgrid(grid)
    print "Longest line length = " + str(leng[0])
    print "Player using O is the winner"
elif leng[1] > leng[0]:
    test(leng[1],pos[1],typ[1],"1")
    Pgrid(grid)
    print "Longest line length = " + str(leng[1])
    print "Player using X is the winner"
else:
    test(leng[0],pos[0],typ[0],"1")
    test(leng[1],pos[1],typ[1],"2")
    Pgrid(grid)
    print "Longest line length = " + str(leng[1])
    print "The game is a draw"
    
    
