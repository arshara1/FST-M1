list1=[1,3,5,4,8,6]
list2=[10,2,3,5,8,7]
list3=[]
list4=[]

for i in list1:
    mod=i%2
    if (mod==1):
        list3.append(i)
print(list3)
for j in list2:
    mod1=j%2
    if (mod1==0):
        list4.append(j)
print(list4)