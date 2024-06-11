
for i in range(10):
    print(str(i) * i)

example_list = ["apple", "banana", "cherry"]
example_list[1]="mango"
example_list.append("melon")
example_list.insert(2,"lemon")
example_list.remove("mango")
example_list.pop(0)
print(example_list)
mylist=example_list.copy()
print(mylist)
list2=[1,2,3]
print(len(example_list)) 
list3=mylist+list2
print(list3)