'''
Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...

Note: O(1) extra space is allowed. Also, try to modify the input array as required.

Input:
First line of input conatins number of test cases T. First line of test case contain an integer denoting the array size N and second line of test case contain N space separated integers denoting the array elements.

Output:
Output the modified array with alternated elements.
'''


def rearangeArrAlternatively(arr):
    n=len(arr)-1
    lefttmp=arr[0]
    righttmp = 0
    i=0
    r=n
    if n==1:
        return

    while r >= i:

        if (i % 2) == 0 and i == 0:
            lefttmp = arr[i]
            arr[i] = arr[r]
            i += 1
            r -= 1
            print("(i % 2) == 0 and i == 0 " , arr ,lefttmp,righttmp,i,r,"\n")
        elif (i % 2) != 0:
            arr[i], lefttmp = lefttmp, arr[i]
            i += 1
            print("(i % 2) != 0 ", arr, lefttmp, righttmp,i,r)
        elif (i % 2) == 0 and i > 0:
            print("(i % 2) == 0 and i > 0 ", arr, lefttmp, righttmp, i, r,"\n")
            if righttmp!=0:
                lefttmp,righttmp=righttmp,lefttmp
                print(lefttmp,righttmp)
            righttmp = arr[i]
            arr[i] = arr[r]
            i += 1
            r -= 1
            print("(i % 2) == 0 and i > 0 ", arr, lefttmp, righttmp,i,r,"\n")

        elif r == i:
            arr[i], lefttmp = lefttmp, arr[i]
            print("r == i ", arr, lefttmp, righttmp,i,r,"\n")

    arr[n] = min(righttmp, lefttmp)
    arr[n - 1] = max(lefttmp, righttmp)

    return arr



arr=[1,2,3,4,5,6]
arr2=[10,20 ,30, 40, 50, 60, 70, 80, 90, 100, 110]
#[110, 10, 100, 20, 90, 40, 80, 80, 90, 70, 60]
#print(rearangeArrAlternatively(arr))
print(rearangeArrAlternatively(arr2))


