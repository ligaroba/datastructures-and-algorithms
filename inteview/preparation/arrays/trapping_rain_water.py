'''
Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai where the width of each block is 1.
Compute how much water can be trapped in between blocks after raining.

Input:
2
4
7 4 0 9
3
6 9 9

Output:
10
0

Explanation:
Testcase 1: Water trapped by block of height 4 is 3 units, block of height 0 is 7 units. So, total unit of water trapped is 10 units.
        9
       ||
 7     ||
||     ||
||     ||
|| 4   ||
||||   ||
||||   ||
||||   ||
||||_0 ||

 So the total number of water trapped (7-4)+7 =10 cause of the zero so height ==7
'''


def trappedWater(arr):
    size=len(arr)

    if arr[0]>arr[size-1]:
        totalTrapped =arr[size-1]
        maxHeight = arr[size-1]
    else:
        totalTrapped = arr[0]
        maxHeight = arr[0]


    for i in range(1,size):

        if arr[i]<=arr[size-1]:
            if i<size-1:
                if arr[i]==0:
                    totalTrapped+= maxHeight

                else:
                    totalTrapped-=arr[i]

    if totalTrapped<0:totalTrapped=0
    return totalTrapped

arr=[7, 4, 0, 9]
arr2=[6, 9, 9]
print(trappedWater(arr))
print(trappedWater(arr2))