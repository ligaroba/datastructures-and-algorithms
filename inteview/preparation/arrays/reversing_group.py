'''

Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow.
Each test case consist of two lines of input. The first line of each test case consists of an integer N(size of array) and an integer K separated by a space.
The second line of each test case contains N space separated integers denoting the array elements.


Input

1 2 3 4 5

10 20 30 40 50 60

Output
3 2 1 5 4
20 10 40 30 60 50

Explanation:
Testcase 1: Reversing groups in size 3, first group consists of elements 1, 2, 3.
 Reversing this group, we have elements in order as 3, 2, 1.
'''


def reverseGroup(arr,k):


    for i in range(0,k):
        print(k)
        if k>i:
            arr[k],arr[i]=arr[i],arr[k]
            k-=1
    print(arr)
    return arr


arr=[10, 20, 30, 40, 50, 60]
print(reverseGroup(arr,3))