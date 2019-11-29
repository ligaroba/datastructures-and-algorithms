'''
Question 1: Write a function which accepts an integer array and its size and modifies the array in the following manner:
1) If the elements of index i and (i+1) are equal then, double the value at index i
and replace the element at index (i+1) with 0.

2) If the element at index i is 0, then ignore it.

3) Any number (element in an array) must be modified only once.

4) At the end, shift all the zeros (0s) to the right of the array and remaining
nonzeros to the left of the array.

Example:
Input: 2 2 0 4 0 8
Output: 4 4 8 0 0 0

Input: 2 2 0 4 0 2
Output: 4 4 2 0 0 0

'''

def manArray(arr,s):
    memo={}
    for i in range(0,s):
        if (i+1)<s:
            if arr[i]==arr[i+1]:
                if arr[i]>0 :
                    arr[i]=arr[i]*2
                    arr[i+1]=0
                    memo[str(i)]=int(1)
    print(arr)
    return sortArr(arr)

def sortArr(arr):
    print("before sorting " + str(arr))
    memo=[]
    s=len(arr)
    for i in range (0,s):
        if (i+1)<s:
          if arr[i] == 0 and arr[(i+1)]>0:
              #print("before " + str(arr))
              #print(i,(i+1))
              tmp=arr[i]
              arr[memo[0]]=arr[i+1]
              arr[i+1]=tmp
              #Store the position of the zero in the memo for refrence  
              memo[0] = i
          elif arr[i]==0 and arr[i+1]==0 :
              #Check if the current position stored in the memo is still zero or it hase been changed
              # if it is still zero retain that index else update it with the most current zero index
              if len(memo)>0:
                  if arr[memo[0]]>0:
                     memo[0]=i
              else:
                memo.append(i)
    #print("test "+ str(arr))
    return arr


test1 = [2,2,0,4,0,2]
test2 = [2,0,0,4,0,8,9,5,0,0]
test3=[1,0,0,0,2,0,4,3]


print(manArray(test3,len(test3)))





