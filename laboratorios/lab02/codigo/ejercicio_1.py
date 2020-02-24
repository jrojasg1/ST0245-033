import time
import random
def Insertion_sort(Vector):
    for i in range(1,len(Vector)):
        actual = Vector[i]
        j = i
        while j>0 and Vector[j-1]>actual:
            Vector[j]=Vector[j-1]
            j = j-1
        Vector[j]=actual


def mergeSort(alist):
    if len(alist)>1:
        mid = len(alist)//2
        lefthalf = alist[:mid]
        righthalf = alist[mid:]

        mergeSort(lefthalf)
        mergeSort(righthalf)

        i=0
        j=0
        k=0
        while i < len(lefthalf) and j < len(righthalf):
            if lefthalf[i] <= righthalf[j]:
                alist[k]=lefthalf[i]
                i=i+1
            else:
                alist[k]=righthalf[j]
                j=j+1
            k=k+1

        while i < len(lefthalf):
            alist[k]=lefthalf[i]
            i=i+1
            k=k+1

        while j < len(righthalf):
            alist[k]=righthalf[j]
            j=j+1
            k=k+1
    

alist = []
for i in range(4500000):
    alist.append(random.randrange(1000000, 5000000, 1000)) 
millis1 = int(round(time.time()  ))
mergeSort(alist)
millis2 = int(round(time.time() ))
print( millis2-millis1)
