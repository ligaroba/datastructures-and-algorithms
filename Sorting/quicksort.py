def partition(dataArray,lowIndex,highIndex):
    divideIndex=lowIndex
    pivot=highIndex

    for i in range(lowIndex,highIndex):
        if dataArray[i]<dataArray[pivot]: #if low index is less than pivot
            # put the divider into i and i into divider
            dataArray[i],dataArray[divideIndex]=dataArray[divideIndex],dataArray[i]
            #increament the divider marks the current position
            divideIndex+=1
    dataArray[pivot], dataArray[divideIndex] = dataArray[divideIndex], dataArray[pivot]
    print(dataArray , " i " , i, dataArray[highIndex])
    return divideIndex # current position of the array divider

def quickSort(dataArray,lowIndex,highIndex):
    #print(" High " , highIndex-lowIndex)
    if(highIndex-lowIndex)>0:
        partIndex=partition(dataArray,lowIndex,highIndex)
        quickSort(dataArray, lowIndex, partIndex-1)
        #print("next recus")
        quickSort(dataArray, partIndex+1,highIndex)

data=[54,26,93,17,77,31,44,55,20]
n=len(data)
print(data)
quickSort(data,0,n-1)
print(data)

""" print ("Sorted array is:")
for i in range(n):
    print ("%d" %data[i]),
"""