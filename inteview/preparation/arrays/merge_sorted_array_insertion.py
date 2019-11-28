'''
Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20}

Input:
First line contains an integer T, denoting the number of test cases. First line of
each test case contains two space separated integers X and Y, denoting the size of the two sorted arrays.
Second line of each test case contains X space separated integers, denoting
the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q
'''
def mergeSortedArr(arr1,arr2):
    n1=len(arr1)-1
    n2=len(arr2)-1
    n=0
    flg=False
    # Check which array is large and assign it to variable arr1
    if n1>n2:
       n=n1
       flg=True
    else :
       n=n2
    i=j=0
    #Swapping variable  of arrays if arr2 is larger than arr1
    if flg == False:
        arr2, arr1 = arr1, arr2

    while True:
       if i < n :
           if arr1[i] > arr2[j]:
               arr1[i], arr2[j] = arr2[j], arr1[i]
           i += 1
       else:
            arr1.append(arr2.pop(0))
            n = len(arr1)
            n2=len(arr2)
            i = 0
            if j<n2:
                j = 0
       if len(arr2)==1 and arr1[len(arr1)-1] <arr2[0]:
           arr1.append(arr2.pop(0))
           break


    return arr1





arr1=[1, 5, 9, 10, 15, 20]
arr2=[2, 3, 8, 13]

arr3=[-2,1,2,3,5]
arr4=[90,-3,-2,-1]

print(mergeSortedArr(arr1,arr2))