num = int(input("Enter a Num: "))

fact = 1 

if(fact == 0):
    print(1)
elif(fact < 1): 
    print("Not Possible")

for i in range(1, num+1):
    print(i)
    fact *= i # fact = fact * i 
              # Fact is reinitialized as the value updates 
              # i = 1, fact = 1, Fact * i = 1 
              # i = 2 , fact = 1, fact * i = 2 
              # i = 3, fact = 2, fact * i = 6 
              # i = 4, fact = 6, fact * i = 24 

print(fact)