# Question: Sqare the elements of array and sort them


Arr = [-1,-2,-9,0,1,2,-3,-4] # An Array with random elements
Sqr_Arr = [x**2 for x in Arr] # Squaring the elements of the array 
print(Sqr_Arr)


# Bubble Sort
for i in range(len(Sqr_Arr)):
    for j in range(0,len(Sqr_Arr) - i - 1):
        if(Sqr_Arr[j] > Sqr_Arr[j+1]):
            Sqr_Arr[j], Sqr_Arr[j+1] = Sqr_Arr[j+1], Sqr_Arr[j]


print(Sqr_Arr)