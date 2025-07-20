# Goal = Check weather the array is sorted
# MY Apprach is that I will check the next element of the  array

List = [1, 2, 3, 4, 5]
is_sorted = True

for i in range(len(List) - 1):  # Avoid IndexError
    if List[i] > List[i + 1]:   # If any pair is not in order
        is_sorted = False
        break

if is_sorted:
    print("Sorted")
else:
    print("Not Sorted")

