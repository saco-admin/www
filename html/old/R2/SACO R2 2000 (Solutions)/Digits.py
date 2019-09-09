def group(target,digits,thusfar):
	if len(thusfar)>0 and len(thusfar[-1])>1 and thusfar[-1][0]=="0": #Make sure there are no groups starting wit hzero
		return
	#print "Target:",target,"\tDigits:",digits,"\tThusfar",thusfar
	if len(digits)==0:
		if target==0:
			print ",".join(thusfar)
		return
	
	for i in xrange(len(digits)):
		group(target-int(digits[:i+1]),digits[i+1:],thusfar+[digits[:i+1]])
digits=raw_input()
target=int(raw_input())
group(target,digits,[])
