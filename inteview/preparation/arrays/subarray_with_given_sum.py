'''

Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. Each test case consists of two lines.
The first line of each test case is N and S, where N is the size
of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of
first such occuring subarray from the left if sum equals to subarray, else print -1.

5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10

'''

def sumOfSubarray(arr,n):
    size = len(arr)
    startIndex=0
    endIndex=0
    sum=0
    res=''

    for i in range(0,size):

       if i==0:
           startIndex=i
       if sum<n:
           sum+=arr[i]
           if sum==n:
               endIndex=i
               res+=str(int(startIndex)+1)+ " " + str(int(endIndex)+1)+" \n"
               if arr[i+1]:
                startIndex=i+1
       if sum>n:
           if (sum-arr[startIndex])==n:
               startIndex+=1
               endIndex=i
               res+= str(int(startIndex) + 1) + " " + str(int(endIndex) + 1) +" \n"
           else : startIndex+=1

    return res



def subArraywithGivenSum(arr,sum):
    n=len(arr)
    l=0
    r=n-1
    res=''

    while l<r:
       if (arr[l]+arr[r])==sum:
           res+=str(arr[l]) + " " + str(arr[r]) + " \n"
           l+=1
           r-=1
       elif arr[l]+arr[r]>sum:
            r-=1
       else :
           #arr[l]+arr[r]<sum:
            l+=1
    return res



def subArraySum(arr,sum):
    n=len(arr)
    start=0
    curr_sum=arr[0]
    i=1
    while i<n-1:
        if curr_sum==sum:
            return " Sub array : " + str(start) + " to: " + str(i) + " sum : " + str(curr_sum)
        else :
           if (i+1)<n:
                 if (curr_sum+arr[i+1])>sum:
                     #print(curr_sum, arr[i], start)
                     curr_sum=curr_sum-arr[start]
                     start+=1

                 else:
                    #print(curr_sum, arr[i])
                    curr_sum = curr_sum + arr[i]
                    i+=1

    return " No matching sub array found "





arr1=[-1,0,1,2,3,4,5,6,7,8,9,10]
arr2=[1,2,3,7,5]
arr3=[1,4,20,3,10,5]
arr4=[11,15,6,8,9,10]
#print(subArraySum(arr1,15))

print(subArraySum(sorted(arr1),15))
print(sumOfSubarray(sorted(arr1),5))
print("Printing all sub array with given Sum \n " + subArraywithGivenSum(sorted(arr1),5))
print("Printing all sub array with given Sum \n " + subArraywithGivenSum(sorted(arr1),10))