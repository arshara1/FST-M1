numbers=list(input("Enter the sequence of number").split( ","))
sum=0
for number in numbers:
    sum += int(number)
print(sum)