'''
Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...

Note: O(1) extra space is allowed. Also, try to modify the input array as required.


Input:
tmp=1
arr[0]=6
1 2 3 4 5 6

10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60

'''


#sort array

def rearrange(arr,n):
    # initialize index of first minimum
    # and first maximum element
    max_ele = arr[n - 1]
    min_ele = arr[0]

    # traverse array elements
    for i in range(n):

        # at even index : we have to
        # put maximum element
        if i % 2 == 0:
            arr[i] = max_ele
            max_ele -= 1

        # at odd index : we have to
        # put minimum element
        else:
            arr[i] = min_ele
            min_ele += 1

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
arr2=[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
n = len(arr2)

rearrange(arr2,n)
#print ("\nModified Array")
#for i in range(0, n):
    #print (int(arr2[i]), end = " ")



def arrngeArrAltnate(arr):
    n=len(arr)
    i=0
    curr_min=arr[0]
    curr_max=arr[n-1]
    while i<n:
        j=n-1
        #shift the arr elements to the right
        while j>i:
            arr[j]=arr[j-1]
            j-=1
        arr[i]=curr_max
        curr_max=arr[n-1]
        i+=2
    return arr

arr1=[1, 2, 3, 4, 5, 6]
arr2=[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]

print(arrngeArrAltnate(arr2))