# Time Complexity: Average O(n^2)
#Type: Inplace

# Concept: We loop through the list with two points, pointer 1: Previous element, pointer 2: The one ahead of it (By 1 iteration) i = 1, j = 2 (Something like this)
# We move the pointer 1 in a temp block and compare the one ahead of it and move it to the pointer 1's position
# if it's less than compared to the temp 

List = [1,2,3,1,2,3,2,67,54,3,6,7]

for i in range(1, len(List)):
        temp = List[i]
        j = i - 1
        while j >= 0 and temp < List[j]:
                List[j+1] = List[j]
                j-=1
        List[j+1] =  temp

print(f"Sorted List: {List}")
