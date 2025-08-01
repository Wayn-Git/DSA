List = [2,2,2,3,4,5,6,7,4,4,4] # Initializing a array 

Convert = set(List) # Converting the array into a set to get rid of the duplicate values

if(len(Convert) != len(List)):
    print("It contain's duplicate values") # Checking weather the lenght of the two data structures are equal (Set removes the duplicate)
else:
    print("Does not contain duplicate values") # If they are of equal lenght we return that it does not contain duplicates

