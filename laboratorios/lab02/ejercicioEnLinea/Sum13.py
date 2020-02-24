def sum13(array):
    suma = 0
    if len(array) == 0:
        return 0
    else:
        for pos in range(0,len(array)):
            if array[pos]==13 and pos+1 > len(array)-1:
                
                array[pos]= 0
            else:
                if array[pos]==13 and pos+1 < len(array)-1:
                    array[pos]= 0
                    array[pos+1]= 0
                else:
                    suma += array[pos]
    return suma
array = [13, 1, 13,7,8]

print(sum13(array))


        
