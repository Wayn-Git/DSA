# Goal: To Iterate through each element of the array and compare each Element to the target 

List = [2,3,4,5,6,6,9]
target = 6 

for i in range(len(List)):
    if(List[i] == target):
        print(f"Index: {i}, Target: {target}")

