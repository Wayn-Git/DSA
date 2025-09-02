# Question: Remove Duplicates from Sorted Array

List = [2,3,1,2,3,6,4,2,1,1]

def RemoveDuplicate(List):
    List.sort()

    i = 0
    for j in range(1, len(List)):


        if List[j] != List[i]:


            i+=1
            List[i] = List[j]

    return i + 1

k = RemoveDuplicate(List)

print(List[k])











