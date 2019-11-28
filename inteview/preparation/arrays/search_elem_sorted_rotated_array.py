'''
Search an element in a sorted and rotated array
An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. So
for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.


pivot=min(arr[0]-key,arr[n/2-1]-key,arr[arr[n-1]-key])
then do binary search
'''


def getPivot(arr,key):
    n=len(arr)
    mid=int(n/2)-1
    pivotVal = min(abs(arr[0]-key),arr[mid]-key,abs(arr[n-1]-key))

    if (abs(arr[0]-key))==pivotVal:
        return 0
    elif (arr[mid]-key)==pivotVal:
        print(mid)
        return mid
    elif abs(arr[n-1]-key) == pivotVal:
        return n-1

def searchElemnt(arr,key):
    pivot = getPivot(arr,key)
    n=len(arr)
    i=pivot
    mid =int(n/2)-1
    if arr[pivot]==key:
        return "Key " + str(key) + " Found "
    print(pivot)
    if i<mid:
         print("test",i)
         while i<mid or i>0:
             if arr[i] == key:
                 return "Key " + str(key) + " Found "
             else:
                 i+=1
         return "Key " + str(key) + " Not Found "
    if i > mid:
        while i >= mid or i < (n):
            if arr[i] == key:
                return "Key " + str(key) + " Found "
            else:
                i -= 1
        return "Key " + str(key) + " not Found "
    return "Key " + str(key) + " not Found "



arr=[5,6,7,8,1,2,3,4]
print(searchElemnt(arr,16))