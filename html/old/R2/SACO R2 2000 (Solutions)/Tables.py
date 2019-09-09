n=int(raw_input())
for i in xrange(1,n+1):
	for j in xrange(i,i*(n+1),i):
		print j,
	print
