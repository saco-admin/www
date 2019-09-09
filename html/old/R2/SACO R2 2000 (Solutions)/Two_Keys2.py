codes={	("L","M"):"A",
		("R","S"):"N",
		("L","R","S","M"):"C",
		("L","R","M","S"):"E",
		("R","L","S","M"):"L",
		("R","L","M","S"):"T",
		} #Dictionary of codes
signals=raw_input()
i=0
while i<len(signals):
	if (signals[i],signals[i+1]) in codes: #If the first two signals make a pair in our list
		print codes[(signals[i],signals[i+1])],
		i+=2
	else: #Otherwise it must be one of the other 4
		print codes[(signals[i],signals[i+1],signals[i+2],signals[i+3])],
		i+=4
