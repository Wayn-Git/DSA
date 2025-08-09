class ListZero: 
    def ListZero(self, x):

        non_zero_list = []
        zero_count = x.count(0)


        for i in range(len(x)):
         if(x[i] != 0):
            non_zero_list.append(x[i])


        zero_list =  [0] * zero_count 
        
        x =   non_zero_list + zero_list

        return x
    
lz = ListZero()

print(lz.ListZero([2,0,3,0,4,0,5,]))