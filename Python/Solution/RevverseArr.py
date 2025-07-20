# The Goal: Reverse the array with SLicing and Inplace

List = [1,2,3,4,5,6,7]

Reversed_List = List[::-1]

print(f"Reversed List Using Slicing: {Reversed_List}")


List = [2,3,4,5,65,69, 69, 69, 100]

i = 0
j = len(List) - 1

while(i < j):
    List[i], List[j] = List[j], List[i]   
    i+= 1 # i = i + 1
    j-=1

print(f"Reverse Using In Place: {List}")















