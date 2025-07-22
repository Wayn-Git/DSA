# Goal: To find two elements in a list that's sum is equal to the target 
# Appraoch: Iteratating through each element and the element in front 

List = [2,3,4,2,3,2]
target = 5

start = 0 
end = len(List) - 1

while(start< end):
    Sum = List[start] + List[end]

    if(Sum == target):
        print(f"Element Index: {start}, Element Index 2: {end}")
        break
    elif(Sum < target):
        start+=1
    else:
        end-=1
