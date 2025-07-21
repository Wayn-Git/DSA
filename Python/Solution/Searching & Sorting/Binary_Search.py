# Goal: Divide the list by the middle element and check weather the target is between those start and end values

List =[2,3,4,5,6,7,8]
target = 7

List.sort()

start = 0
end = len(List) - 1


while(start <= end):
    mid = int((start + end) / 2)

    if(target == List[mid]):
        print(mid)
        break
    elif(List[mid] < target):
        start = mid + 1
    elif(List[mid] > target):
        end = mid - 1
    else:
        print("Not Found")
    
