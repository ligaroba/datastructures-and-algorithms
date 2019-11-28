


def maxheapfy(arr,n,i,count):
    largest=i
    l=2*i
    r=2*i+1
    count=count

    if count==n:
        return 0
    if l<n and arr[i]<arr[l]:
        largest=l
    if r<n and arr[largest]<arr[r]:
        largest=r
    if largest!=i:
        arr[i],arr[largest]=arr[largest],arr[i]

    print(arr)
    maxheapfy(arr,n,largest,count+1)

def minheapfy(arr,n,i,count):
    smallest=i
    l=2*i
    r=2*i+1
    count=count
    if count==n:
        return 0

    if l<n and arr[i]>arr[l]:
        smallest=l
    if r<n and arr[smallest]>arr[r]:
        smallest=r

    if smallest!=i:
        arr[i],arr[smallest]=arr[smallest],arr[i]
    print(arr)
    minheapfy(arr,n,smallest,count+1)



#print(maxheapfy(arr,n,0))


def medianStream(arr):
    maxHeap=list()
    minHeap=list()
    median=0
    # if the min and max heap is empty add the 1st zero as the at the zero index
    # since were are not  going to use index zero for heaps
    # add the 1st and 2nd element from the stream to max and min heap respectively
    if len(maxHeap)==0 and len(minHeap)==0:
        maxHeap.append(0)
        minHeap.append(0)
        if arr[0]>arr[1]:
            maxHeap.append(arr[1])
            minHeap.append(arr[0])
            median=(arr[0]+arr[1])/2
            print("min heap ", minHeap, "max heap " , maxHeap," median " ,median )


    for i  in range (2,len(arr)):
        if maxHeap[0]>arr[i] :
            maxHeap.append(arr[i])
        else:
            minHeap.append(arr[i])
            #minheapfy(minHeap, len(minHeap), 1)

        # if the len of max and mi heap ar same mediam= avg(top element of min and max heap)
        if len(maxHeap) == len(minHeap):
            median = (maxHeap[1] + minHeap[1]) / 2

        # Check if the diffrence in sizes of the heap is not more than 1 else balance the heaps
        elif len(maxHeap)>len(minHeap):

            if len(maxHeap)-len(minHeap)==1:
                 median=maxHeap[1]
                 print("in median ", median)
            else:
                # balance the  heaps
                if len(minHeap) < len(maxHeap):
                    minHeap.append(maxHeap.pop(1))
                    maxheapfy(maxHeap, len(maxHeap), 1, 0)
                    minheapfy(minHeap, len(minHeap), 1, 0)

        elif len(minHeap)>len(maxHeap):
            if len(maxHeap)-len(minHeap)==1:
                 median=maxHeap[1]
                 print("in median ", median)

            else:
                if len(maxHeap)<len(minHeap):
                    maxHeap.append(minHeap.pop(1))
                    maxheapfy(maxHeap,len(maxHeap),1,0)
                    minheapfy(minHeap,len(minHeap),1,0)

    if len(maxHeap) == len(minHeap):
            median = (maxHeap[1] + minHeap[1]) / 2

    elif len(maxHeap)>len(minHeap):
         median=maxHeap[1]
    else:
        median = minHeap[1]

    print("min heap ", minHeap, "max heap ", maxHeap, " median ", median)


arr = [ 12, 11, 13, 5, 6,4, 7,14,15]
n=len(arr)
print(medianStream(arr))

