'''
Find the maximum element in an array which is first increasing and then decreasing
Given an array of integers which is initially increasing and then decreasing, find the maximum value in the array.
Examples :


'''
'''Time complexity O(n)'''

def maxElemnt(arr,size):
    memo=arr[0]
    for i in range(0,size):
        if arr[i]> memo:
            memo=arr[i]
    return memo


''' '''
test0=[8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1]
test1=[1, 3, 50, 10, 9, 7, 6]
test2=[10, 20, 30, 40, 50]
test3= [120, 100, 80, 20, 0]
test4=[0, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 3, 3, 2, 2, 1, 1]
size=len(test4)
print(maxElemnt(test4,size))