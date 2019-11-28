'''


Chocolate Distribution Problem

Given an array of n integers where each value represents number of chocolates in a packet.
Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

    Each student gets one packet.
    The difference between the number of chocolates in packet with maximum chocolates and
    packet with minimum chocolates given to the students is minimum.

Examples:

    Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
    m = 3
    Output: Minimum Difference is 2
    We have seven packets of chocolates and
    we need to pick three packets for 3 students
    If we pick 2, 3 and 4, we get the minimum
    difference between maximum and minimum packet
    sizes.

    Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12}
    m = 5
    Output: Minimum Difference is 6
    The set goes like 3,4,7,9,9 and the output
    is 9-3 = 6

    Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41,
    30, 40, 28, 42, 30, 44, 48,
    43, 50}
    m = 7
    Output: Minimum Difference is 10
    We need to pick 7 packets. We pick 40, 41,
    42, 44, 48, 43 and 50 to minimize difference
    between maximum and minimum

'''

import sys;

# arr[0..n-1] represents sizes of packets
# m is number of students.
# Returns minimum difference between maximum
# and minimum values of distribution.
def findMinDiff(arr, n, m):

    # if there are no chocolates or number
    # of students is 0
    if ( m ==0 or n== 0):
        return 0

    # Sort the given packets
    arr.sort()

    # Number of students cannot be more than
    # number of packets
    if (n < m):
        return -1

    # Largest number of chocolates
    min_diff = sys.maxsize

    # Find the subarray of size m such that
    # difference between last (maximum in case
    # of sorted) and first (minimum in case of
    # sorted) elements of subarray is minimum.
    first = 0
    last = 0
    i = 0
    while (i + m - 1 < n):

        diff = arr[i + m - 1] - arr[i]
        if (diff < min_diff):
            min_diff = diff
            first = i
            last = i + m - 1

        i += 1

    return (arr[last] - arr[first])


# Driver Code
if __name__ == "__main__":
    arr = [12, 4, 7, 9, 2, 23, 25, 41,
           30, 40, 28, 42, 30, 44, 48,
           43, 50]
    m = 7  # Number of students
    n = len(arr)
    print("Minimum difference is", findMinDiff(arr, n, m))




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



def chocolateProblem(arr,m):
    size=len(arr)
    arr=sortArr(arr,0,size-1)
    min_diff=999999
    first=0
    last=0
    if (n<m):
        return -1
    for i in range(0,size):
        last=i+m-1
        if (last)<size:

            diff=(arr[last]-arr[i])
            if diff<min_diff:
                min_diff=diff
            last+1

    return min_diff


arr=[3, 4, 1, 9, 56, 7, 9, 12]
#print(chocolateProblem(arr,5))
arr1=[7, 3, 2, 4, 9, 12, 56]
#print(chocolateProblem(arr1,3))
arr2=[12, 4, 7, 9, 2, 23, 25, 41,
    30, 40, 28, 42, 30, 44, 48,
    43, 50]
print(chocolateProblem(arr2,7))