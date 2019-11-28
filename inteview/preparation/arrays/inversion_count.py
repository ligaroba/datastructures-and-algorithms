'''
Given an array of positive integers. The task is to find inversion count of array.

Inversion Count : For an array, inversion count indicates how far (or close)
the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.


Input:

2 4 1 3 5

Output:
3

'''
# Doing it with merge sort and counting the number of passes of the sorting algo does to archieve a sorted arr
def inversionCount(arr):
    size=len(arr)
    inver_count=0
    for i in range(0,size):
        if (i+1)<size:
            if arr[i]<arr[i+1]:
                inver_count+=1
    return inver_count


def getInvCount(arr, n):

    inv_count = 0
    for i in range(n):
        for j in range(i + 1, n):
            if (arr[i] > arr[j]):
                inv_count += 1

    return inv_count

# Driver Code
arr = [1, 0,20, 6, 4, 5,10]
n = len(arr)
print(inversionCount(arr))
print("Number of inversions are",
      getInvCount(arr, n))

# This code is contributed by Smitha Dinesh Semwal
