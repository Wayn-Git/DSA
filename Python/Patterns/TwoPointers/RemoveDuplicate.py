# Question: Remove Duplicates from Sorted Array

List = [2,3,1,2,4,5,2,1,2,3,5,6,5,3,3]

def RemoveDuplicates(List):
    List.sort() # Sorting for two pointers

    i = 0 # Pointer 1, Changes as we find a unique element
    for j in range(1, len(List)): # one ahead than i, NEVER RESETS
        if List[j] != List[i]:
            i+=1 # The List[i] (Where i = 0) stays the same and we move to List[i] (where i =  1) 
            List[i] = List[j] # and replace it with the unique  j we found
    return i + 1 # i originally points to set of unique elements which could be like in a List of 5 elements 
                  # it could be around 5 but the index stays at 4 (The last unique)


k = RemoveDuplicates(List)

print(List[:k]) # It goes like, start at 0 and end before k which is index 5









