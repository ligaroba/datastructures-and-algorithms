'''
Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases.
For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Input:
1 2 3 5

1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
'''


def missingNoArr(arr):
    size=len(arr)
    xor1=arr[0]
    xor2=1

    for i in range(1,size):
        xor1^=arr[i]
    for j in range(1, size+1):
        xor2 ^= j+1
    return xor1^xor2





arr1=[1,2,3,4,5,6,7,8,10]
arr2=[1,2,3,5]

print(missingNoArr(arr1))
print(missingNoArr(arr2))