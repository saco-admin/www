import math

def odsyeven(num): #Returns True if odd
	oddtotal=0
	eventotal=0
	for i in str(num): #Note the conversion to string making iteration of digits easy
		if int(i)%2==0: # x%2 is the remainder when x is divided by 2 and is zero for all even numbers
			eventotal+=int(i)
		else:
			oddtotal+=int(i)
	return oddtotal==eventotal #If the two totals are the same, its odsyeven
	
def prime(num):
	for i in xrange(2,int(math.sqrt(num))+1): #Check every number from 2 (not 0 or 1!) to the square root of num
		if num%i==0: #If num divided by the number has no remainder (divides perfectly), the number is not prime
			return False
	return True #If it isn't divisible by any of those numbers

nonums=True
for i in xrange(int(raw_input("Enter value for A: ")),int(raw_input("Enter value for B: "))):
	if odsyeven(i) and prime(i):
		print i,"is an oddsy-even prime number."
		nonums=False
if nonums:
	print "No numbers found"
