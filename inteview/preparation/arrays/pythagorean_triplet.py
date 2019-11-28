'''
Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

Input:
The first line contains T, denoting the number of testcases. Then follows description of testcases. Each case begins with a single positive integer N denoting the size of array.
The second line contains the N space separated positive integers denoting the elements of array A.

Input:
1
5
3 2 4 6 5

Output:
Yes

Explanation:
Testcase 1: a=3, b=4, and c=5 forms a pythagorean triplet, so we print "Yes"


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



def pythagoreanTripplets(arr):
    size=len(arr)
    arr=sortArr(arr, 0, size-1)
    maxRightIndx=size-1
    nextPair=size-2

    triplet="False"
    for i in range(0,size):
        arr[i]*=arr[i]
    print(arr)
    for i in range(0,size-2):
        print(i,nextPair,maxRightIndx)
        if i<nextPair:
            if (arr[i]+arr[nextPair])==arr[maxRightIndx]:
                triplet="Yes"
                return triplet
        else :
            i=0
            nextPair-=1
            maxRightIndx-=1
    return triplet

def Workinloop():
    for i in range(n - 1, 1, -1):
        # start two index variables from
        # two corners of the array and
        # move them toward each other
        j = 0
        k = i - 1
        while (j < k):
            # A triplet found
            if (ar[j] + ar[k] == ar[i]):
                return True
            else:
                if (ar[j] + ar[k] < ar[i]):
                    j = j + 1
                else:
                    k = k - 1
                    # If we reach here, then no triplet found
    return False


arr=[3, 2, 4, 6, 5]
print(pythagoreanTripplets(arr))






