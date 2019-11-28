'''
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.


Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

input:
1 5 3 2
3 2 7
Output:
2
-1
Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
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




def countOfTripplets(arr):
    count=0
    size = len(arr)
    sarr=sortArr(arr, 0,size-1)
    print(sarr)
    for i in range(0,size):
        if (i+2)<size:
            if (sarr[i]+sarr[i+1])==sarr[i+2]:
                print(sarr[i],sarr[i+1],sarr[i+2])
                count+=1
    if count==0 : count=-1
    return count




arr1=[1,5,3,2]
arr2=[3,2,7]
print(countOfTripplets(arr1))