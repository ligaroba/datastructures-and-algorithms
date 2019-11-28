"""
Given an array A of N positive integers. Find the sum of maximum sum increasing subsequence of the given array.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N(the size of array). The second line of each test case contains array elements.

Output:
For each test case print the required answer in new line.
"""


def maxIsubsquence(arr):
    maxSumLen=0
    maxLenSoFar=0
    starIdx=0
    startIdxSofar=0
    endIdx=0
    endIdxSoFar=0

    for i in range(len(arr)-1):
        if (i+1)<len(arr)-1:
            if arr[i]<arr[i+1]:
                maxLenSoFar+=1
                if maxLenSoFar>maxSumLen:
                    maxSumLen=maxLenSoFar
                    startIdxSofar=i
                    starIdx=startIdxSofar
                else:
                    maxLenSoFar=0
                    endIdx=i
    return maxSumLen,starIdx,endIdx


def dpMaxIcreasingSub(arr):
    m=[1 for i in range(len(arr))]
    maxSum=[]
    maxSum.append(arr[0])
    global_max_sum=0
    max_so_far=arr[0]
    for i in range(1,len(arr)):
        if arr[i-1]<arr[i]:
            m[i]=1+m[i-1]
            max_so_far+=arr[i]

            if global_max_sum<max_so_far:
                global_max_sum=max_so_far
                maxSum.append(arr[i - 1])

        else:
            m[i]=max(m[i-1],m[i])
            maxSum.pop(len(maxSum) - 1)
            maxSum.append(arr[i])


            # if there arr[i-1]<arr[i] is not true subtract the previous arr[i-1]
            #  bigger value and the next small value arr[i]
            max_so_far=(max_so_far-arr[i-1])+arr[i]
    print(maxSum)
    print('longest Increasing subsequence ' ,m[len(m)-1] )
    print('max Sum in an Increasing subsequence ' , global_max_sum)
    return m[len(m)-1]


arr=[1,101, 2, 3, 100, 4, 5]
print(dpMaxIcreasingSub(arr))





