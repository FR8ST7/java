arr= [10,20,30,40,50]
for i in arr:
    print(i)
x=[90]
arr= arr+x
print("new array:",arr)
arr.pop(5)
print("new array after removing last element:",arr)
print("element at 2nd position:",arr[1])