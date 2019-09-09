### Problem "Hidden Strings" for Computer Olympiad Second Round 2007. Solution by Bernard Steenhuisen

sentence    = raw_input()      #Input string
search_word = raw_input().lower()  #search string, in lower case   

formatted_sentence=""
pointer=-1
linkedlist=[]  #keeps positions of characters with refercence to original string
for char in sentence.lower():
   pointer+=1
   if char.isalpha(): 
       formatted_sentence+=(char)  
       linkedlist.append(pointer)

occurs= formatted_sentence.count(search_word)
if occurs>0:
   lim=0
   for x in xrange(occurs):    
       temp = formatted_sentence.find(search_word,lim) 
       print sentence[(linkedlist[temp]):(linkedlist[temp+len(search_word)])]
       lim = temp+len(search_word)     #moves the search pointer up
else:
   print 'No strings found'
