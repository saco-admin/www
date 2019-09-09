signals=raw_input()
i=0
while i<len(signals):
	if (signals[i+1]=="M" or signals[i+1]=="S"): #One of the two-length codes
		if signals[i]=="L": print "A",
		else: print "N",
		i+=2
	else:#else 4 length
		if signals[i]=="L" and signals[i+2]=="S": print "C",
		elif signals[i]=="L": print "E",
		elif signals[i]=="R" and signals[i+2]=="S": print "L",
		else: print "T",
		i+=4
