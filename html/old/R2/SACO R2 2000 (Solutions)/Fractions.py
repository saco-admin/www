#note we use a dictionary to check if a fraction already exists in our list because it is *much* faster, though we could just use the fracs list to check
#The dictionary maps a floating point fraction to a position in our list
dic={} #This lets us know if a fraction already exists in our list
fracs=[]
for i in xrange(2,99): #Make the list
	for j in xrange(1,i):
		x=j/(i+0.0) #Floating point!
		if x not in dic: #If the floating point result is not already in the list
			dic[x]=len(fracs) #Add it to the dictionary
			fracs+=[x] #add it to the list

f=int(raw_input("Enter first number (f): "))-1
s=int(raw_input("Enter second number (s): "))-1
sum=fracs[f]+fracs[s]
if sum in dic: #If it exists
	print "Position of sum is:",dic[sum]+1
else:
	print "Position of sum is: 0"
