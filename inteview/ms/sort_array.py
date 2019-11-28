'''
Sorting Array

'''

''' Merge sort '''

#def splitArray(arr,);



''' Quick sort'''
def get_pivot(arr,low,high):
    print(low,high)
    mid=(low + high)//2
    print(mid)
    pivotIndex=high
    if arr[mid] > arr[low] and arr[mid] < arr[high]:
        pivotIndex=mid
    elif arr[mid]> arr[high]:
        pivotIndex=high
    elif arr[low] > arr[mid]:
        pivotIndex=low
    print("test " + str(pivotIndex))
    return pivotIndex

def partion(arr,low,high):
    print(low,high)
    pivotIndex = get_pivot(arr,low,high)
    print("tes3t " + str(pivotIndex))
    pivotValue=arr[pivotIndex]
    arr[pivotIndex],arr[low]=arr[low],arr[pivotIndex]
    border=low

    for i in range(low,high+1):
        if arr[i]<pivotValue:
            border+=1
            arr[i],arr[border]=arr[border],arr[i]
            arr[low],arr[border]=arr[border],arr[low]
    return (border)

def quick_sort(arr,low,high):
    p=partion(arr,low,high)
    quick_sort(arr,low,p-1)
    quick_sort(arr,p+1,high)

def get_unsorted_array(arr,size):
    quick_sort(arr, 0, int(size-1))




def sort_function(arr,size):
    if size>0:
        small=arr[0]
        memo=0
        for i in range (0,size):
            if arr[i]<arr[memo]:
                tmp=arr[i]
                #memo=
                arr[i]=arr[memo]
                memo=i
        return arr
    else :
        return 0

test0 = [8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1]
test1 = [1, 3, 50, 10, 9, 7, 6]
test2 = [10, 20, 30, 40, 50]
test3 = [120, 100, 80, 20, 0]
test4 = [0, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 3, 3, 2, 2, 1, 1]
size = len(test0)

def sort_list(arr,arrb):
    set_arra=set(arr)
    set_arrb=set(arrb)
    sorted=arr+arrb
    return sorted
my_list     = [3, 4, 6, 10, 11, 15]
alices_list = [1, 5, 8, 12, 14, 19]
print(sort_list(my_list,alices_list))
print(get_unsorted_array(sort_list(my_list,alices_list), len(sort_list(my_list,alices_list))))





