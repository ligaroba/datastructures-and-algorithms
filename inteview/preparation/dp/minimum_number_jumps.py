"""
Given an array of integers where each element represents the max number of steps that can be made forward from that element. The task is to find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.

Input:
The first line contains an integer T, depicting total number of test cases.  Then following T lines contains a number n denoting the size of the array. Next line contains the sequence of integers a1, a2, ..., an.

Output:
For each testcase, in a new line, print the minimum number of jumps. If answer is not possible print "-1"(without quotes).


Example:
Input:
2
11
1 3 5 8 9 2 6 7 6 8 9
6
1 4 3 2 6 7
Output:
3
2

Explanation:
Testcase 1: First jump from 1st element, and we jump to 2nd element with value 3. Now,
from here we jump to 5h element with value 9. and from here we will jump to last.

"""
import sys
def min_jumps(arr,i,jump):
    size=len(arr)-1
    jumps=jump

    if  size<=0 or arr[i]==0:
        return 0
    elif jumps[0]==-1 :
         jumps[0]=arr[i]

    if arr[i]==1:
        jumps[i+1]=arr[i+1]
        i+=1

        min_jumps(arr, i, jumps)

    else:

        min_val_index=0
        min_val = 0
        if (size)-i< (size)-arr[i]:
              n=(size)-i
        else :
           n=arr[i]+1
        print('n', n, ' i ', i,' arr[i] ', arr[i])


        for j in range(i+1,n):
            if j<n:
                  print('here ' , jumps[i+1],j,arr[j],i)
                  if ((size)-arr[j+1])<((size)-jumps[i+1]):
                        jumps[i+1]=arr[j+1]
                        print(size,jumps[i+1],arr[j+1],'(size-arr[j+1]',(size-arr[j+1]),'(size-jumps[i+1])', (size-jumps[i+1]))
                        min_val_index=j+1
                        min_val=arr[j+1]
                  print('jumps ' , jumps)

        i+=min_val_index
        print('test',jumps,i,min_val,len(arr[i:]),arr[i:])
        if len(arr[i+1:])==min_val:
          return jumps
        else :
            min_jumps(arr,i,jumps)






arr=[1,3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
arr2=[1, 3, 6, 1, 0, 9]
arr3 = [1, 3, 6, 3, 2, 3, 6, 8, 9, 5]
jump=[-1 for i in range (len(arr3))]
print(min_jumps(arr,0,jump))