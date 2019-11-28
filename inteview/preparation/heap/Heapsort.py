
def buildMaxHeap(arr, n):
#parent position : i/2
#child position : i
    for i in range(n):

        # if child is bigger than parent
        if arr[i] > arr[int((i - 1) / 2)]:
            print(i)
            print(arr[i],'>',arr[int((i - 1) / 2)],i,int((i - 1) / 2))
            j = i
            # swap child and parent until
            # parent is smaller
            while arr[j] > arr[int((j - 1) / 2)]:
                (arr[j],arr[int((j - 1) / 2)]) = (arr[int((j - 1) / 2)], arr[j])
                j = int((j - 1) / 2)
    return arr

arr= [ 1, 11, 13, 5, 6, 7]
arr2=[1,2, 3, 4, 5, 6, 7, 8, 9, 10]
print(buildMaxHeap(arr2,len(arr2)))

#print(maxheapfy(arr,len(arr),1,1))
