#numlist=[10,20,30,10]
numlist=list(input("Enter the number").split(","))
print(numlist)

firstelement=numlist[0]
lastelement=numlist[-1]
if (firstelement == lastelement):
    print(True)
else:
    print(False)