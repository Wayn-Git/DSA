# Time complexity of O(n^2)
#Inpalce sort

unsorted_List = [2,3,1,3,5,34,2,4,5,6,3]

flag = True

while flag:
    flag = False
    for i in range(1,len(unsorted_List)):
        if unsorted_List[i-1] > unsorted_List[i]:
            flag=True
            unsorted_List[i], unsorted_List[i-1] = unsorted_List[i-1], unsorted_List[i]

print(unsorted_List)