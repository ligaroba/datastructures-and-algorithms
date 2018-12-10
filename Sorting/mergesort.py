import math

def divideArray(dataArray):
    arrSize=len(dataArray)
    if arrSize==1:
        return # list of one item is considered sorted

    midpoint=math.floor(arrSize/2)
    # split the array
    leftArray=dataArray[:midpoint]
    rightArray=dataArray[midpoint:]
    #print(midpoint, leftArray, rightArray)

    # recursively call divideArray on the arrays
    divideArray(leftArray)
    divideArray(rightArray)

    mergesort(leftArray,rightArray,dataArray)
    return  dataArray


def mergesort(leftArray,rightArray,dataArray):
    i=j=k=0

    while j<len(leftArray) and i<len(rightArray):

        if(rightArray[i]<leftArray[j]):
            dataArray[k]=rightArray[i]
            print(dataArray[k]," :  ",leftArray[j]," < ",rightArray[i])
            i+=1
        else:
            dataArray[k]=leftArray[j]
            print(dataArray[k],": ",rightArray[i]," >  " , leftArray[j])
            j+=1
        k+=1

    # Checking if any is left
    while i<len(rightArray):
        dataArray[k]=rightArray[i]
        i+=1
        k+=1
    while j < len(leftArray):
        dataArray[k] = leftArray[j]
        j += 1
        k += 1

data=[54,26,93,17,77,31,44,55,20]
print(divideArray(data))

