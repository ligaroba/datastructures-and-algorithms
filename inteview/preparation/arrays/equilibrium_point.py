'''
Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position
such that the sum of elements before it is equal to the sum of elements after it.


Input:
The first line of input contains an integer T, denoting the number of test cases.
Then T test cases follow. First line of each test case contains an integer N denoting
the size of the array. Then in the next line are N space separated values of the array A.

Input:
2
1
1
5
1 3 5 2 2

Output:
1
3

Explanation:
Testcase 1: Since its the only element hence its the only equilibrium point.
Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).
'''


def pivotEquilibrium(arr):
    size=len(arr)
    sum=0

    leftsum=0
    for i in range(0,size):
        sum+=arr[i]

    for i in range(0,size):
        sum-=arr[i]
        if leftsum==sum:
            return i
        leftsum+=arr[i]
    return -1



arr=[1,3,5,2,2]
arr1=[5]
print(pivotEquilibrium(arr1))
