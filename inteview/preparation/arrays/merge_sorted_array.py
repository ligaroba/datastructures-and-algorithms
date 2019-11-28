'''
Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20}

Example:
Input:
1 3 5 7
0 2 6 8 9


10 12
5 18 20

Output:
0 1 2 3 5 6 7 8 9
5 10 12 18 20

Explanation:
Testcase 1: After merging two non-decreasing arrays, we have, 0 1 2 3 5 6 7 8 9.
'''


def mergeSortedArray(arr1,arr2):
       size_arr1=len(arr1)
       size_arr2=len(arr2)
       tsize=(size_arr2+size_arr1)-2

       if size_arr2>size_arr1:
           size=size_arr2
           tmp = arr1[0]
       else:
           size=size_arr1
           tmp = arr2[0]


       slowIndex=0
       print("tmp",tmp)
       #We use the size of the bigger array
       for i in range(0,tsize):
           #check which array size is bigger
           if size_arr2 > size_arr1:
               # check if the value at the small array is less than the value at the index i of the bigger array
               if arr1[slowIndex]<arr2[i]:
                   # store the value of the big array on a tmp variable and replace the value at big array with the
                   #value of the small array
                   tmp=arr2[i]
                   arr2[i]=arr1[slowIndex]
                   print("tt",slowIndex, arr1[slowIndex],tmp)
                   #check if the slowindex oof the small array is within the range os size of small array and increment slow index
                   if (slowIndex+1)<size_arr1:
                        slowIndex+=1

                   #check if value of tmp is less than the next value in the next index and swap
                   if (i+1)<size_arr2:
                       if arr2[i + 1] > tmp:
                           arr2[i + 1], tmp = tmp, arr2[i + 1]

                   if arr2[i - 1] > tmp:
                       arr2[i - 1], tmp = tmp, arr2[i - 1]
                       print("tmp", tmp)
                       arr2.append(tmp)
                   else:
                       arr2.append(tmp)


                   print(tmp)
       if arr2[len(arr2) - 2] > arr2[len(arr2)-1]:
           print("test")
           arr2[len(arr2) - 2], arr2[len(arr2)-1] = arr2[len(arr2)-1], arr2[len(arr2)-2]
       #print("tesot", i, "arr", arr2, "arr -1= ", arr2[i - 1], " arr2[i] =", arr2[i], tmp)

       return arr1,arr2

#Method two using O(logn) sorting algorithm

def partition(arr,lowIndex,highIndex):
    dividerIndex=lowIndex
    pivot=highIndex
    size=len(arr)

    for i in range(lowIndex,highIndex):

        if arr[i]<arr[pivot]:
            arr[dividerIndex],arr[i]=arr[i],arr[dividerIndex]
            dividerIndex+=1
    arr[dividerIndex], arr[pivot] = arr[pivot], arr[dividerIndex]
    return dividerIndex

def sorArr(arr,lowIndex,highIndex):
    if (highIndex-lowIndex)>0:
        part=partition(arr,lowIndex,highIndex)
        sorArr(arr,lowIndex,part-1)
        sorArr(arr, part+1, highIndex)
    return arr



arr1=[1 ,3 ,5 ,7,10,12]
arr1b=[0,2, 6, 8, 9,11,13]
arr3=[0,0,1,2,2]

arr2=[10,12]
arr2b=[5,18,20]
size1=len(arr1+arr1b)
size2=len(arr2+arr2b)
size=len(arr2)
#print(sorArr(arr1+arr1b,0,size1-1))
#print(sorArr(arr2+arr2b,0,size2-1))
print(sorArr(arr3,0,size-1))


#print(mergeSortedArray(arr2,arr2b))