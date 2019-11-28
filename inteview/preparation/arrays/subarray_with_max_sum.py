'''
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Example:
Input

1 2 3 -2 5

-1 -2 -3 -4
Output
9
-1
Explanation:
Testcase 1: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

'''
# getting max sum of contiguous subarray without positive
def maxSumPositive(arr):
    current_max_value=0
    max_value=0

    size=len(arr)
    for i in range(0,size):
        current_max_value+=arr[i]
        #print(current_max_value,arr[i],current_max_value)
        if current_max_value<0:
            current_max_value=0
        elif max_value<current_max_value:
            max_value=current_max_value
    return max_value

def maxValue(x,y):
    if x>y:
        return x
    else:
        return y

#Lagest contiguous sum including negative
def largeSumSubarray(arr):
    size=len(arr)
    current_max_value=arr[0]
    max_value=arr[0]
    for i in range(1,size):
       current_max_value=maxValue(arr[i],current_max_value+arr[i])
       max_value=maxValue(max_value,current_max_value)
    return max_value


def maxSumArray(arr):
    size=len(arr)

    posSum=9999
    negMax=-9999
    for i in range(0,size):
        if (1+i)<size+1:
            #print(i,i+1)
            if arr[i]<0  :
               if negMax==-9999:
                    negMax=arr[i]
               if negMax>i:
                    negMax=arr[i]
            if arr[i]>0:
                if posSum==9999:
                     posSum=arr[i]
                else:
                    posSum+=arr[i]
                    #print(posSum,arr[i])

    if posSum != 9999 :
        return posSum
    else :return negMax



arr1=[1,2,3,-2,5]
arr2=[-1,-2,-3,-4]

print(largeSumSubarray(arr1))
print(largeSumSubarray(arr2))
#print(maxSumArray(arr1))
#print(maxSumArray(arr2))




