fruit_shop={
    "apple":10,
    "mango":13,
    "cherry":20,
    "orange":12
}
key_in_Dict=input("Enter the fruit you are looking in shop:").lower()

if (key_in_Dict in fruit_shop):
    print("Yes, this is available")
else:
    print("No, This not available")
    

