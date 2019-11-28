'''

Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases.
Then T testcases follow. Each testcases contains two lines of input.
The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.


Input :
0 2 1 2 0

0 1 0

Output:
0 0 1 2 2
0 0 1
'''

def moveZerosToStart(arr):
    n=len(arr)
    i=n-1
    poszero=-1
    while (i-1)>-1:
        if arr[i]==0 and arr[i-1]>0:
            print(arr)
            arr[i],arr[i-1]=arr[i-1],arr[i]
            #store the max pos of zero element 
            poszero = max(poszero, i-1)
            if arr[i] > 0 and poszero>i:
                arr[poszero], arr[i] = arr[i], arr[poszero]
                if arr[poszero - 1] == 0:
                    poszero -= 1
            i -= 1

        else:
           i-=1

    return arr



arr3=[0,0,1,2,2]
arr1=[0,1,0]
arr=[0,2,1,2,0]
arr4=[1,0,0,0,2,0,4,3]
print(moveZerosToStart(arr))

