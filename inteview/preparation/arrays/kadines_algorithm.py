'''
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
'''


def subArraymaxSum(arr):
    n=len(arr)
    gsum=arr[0]
    curr_sum=0
    for i in range(n):
        curr_sum+=arr[i]
        print(curr_sum,gsum)
        gsum=max(gsum,curr_sum)

    return gsum

arr=[-1,-2,-3,-4]
arr2=[1,2,3,-2,5]
arr3=[-3,-2,-1,-4]

#print("arr " ,subArraymaxSum(arr))
#print("arr2 " ,subArraymaxSum(arr2))
print("arr3 " ,subArraymaxSum(arr3))