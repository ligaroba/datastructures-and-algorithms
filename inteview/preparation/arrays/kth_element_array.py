'''

Given an array arr[] and a number K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Input:

7 10 4 3 20 15
3

7 10 4 20 15
4

Output:
7
15

Explanation:
Testcase 1: 3rd smallest element in the given array is 7.


'''


def partition(arr,lowIndex,highIndex):
    divideIndex=lowIndex
    pivot=highIndex

    for i in range(lowIndex,highIndex):
        if arr[i]<arr[pivot]:
            arr[i],arr[divideIndex]= arr[divideIndex],arr[i]
            divideIndex+=1
    arr[pivot],arr[divideIndex]=arr[divideIndex],arr[pivot]
    return divideIndex

def sortArr(arr,lowIndex,highIndex):
    if (highIndex-lowIndex)>0:
       part=partition(arr, lowIndex, highIndex)
       sortArr(arr,lowIndex,part-1)
       sortArr(arr, part+1, highIndex)
    return arr

arr=[7 ,10,4, 3, 20, 15]
def kthelem(arr,k):
    arr=sortArr(arr, 0, len(arr)-1)
    return arr[k-1]

print(kthelem(arr,3))
