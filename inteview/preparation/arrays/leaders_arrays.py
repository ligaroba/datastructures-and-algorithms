''''
Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Input:

16 17 4 3 5 2

1 2 3 4 0

7 4 5 7 3
Output:
17 5 2
4 0
7 7 3

'''

def leadersArray(arr):
    size=len(arr)
    current_max=arr[size-1]
    leaders=[]
    for i in arr[::-1]:

        if i >= current_max:
            current_max=i
            leaders.append(current_max)
    return leaders

arr=[16,17, 4, 3, 5, 2]
arr2=[1,2, 3, 4, 0]
arr3=[7 ,4 ,5, 7, 3]
print(leadersArray(arr))
print(leadersArray(arr2))
print(leadersArray(arr3))