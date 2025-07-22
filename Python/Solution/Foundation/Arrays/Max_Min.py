# The goal is to locate the maximum or the minimum value in a list. My appraoch :
# Initializing a max Varible to 0 (The first index) and comparing it to the other elements 
# If the other element is bigger just re initialize the value until we iterate through all the 
# Elements in the list could use a for loop 

Nums = [2,3,2,5,6,7,9]
Max = 0

for i in range(len(Nums)):
    
    if(Nums[i] > Nums[Max]):
        Max = i
    
print(Nums[Max])


# For Minumum We Just Need to flip the ">" Sign to "<"


# Nums = [2,3,2,5,6,7,9,7,12,190]
# Max = 0

# for i in range(len(Nums)):
    
#     if(Nums[i] < Nums[Max]):
#         Max = i
    
# print(Nums[Max])

