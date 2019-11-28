'''
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1"

'''
def countTripletsSortedArr(arr):
    n = len(arr) - 1
    i = n
    start = i - 1
    end = start - 1
    counter = 0
    sarr=sorted(arr)

    while i!=1:
        if end>-1:
            if sarr[i]==(sarr[start]+sarr[end]):
                print(sarr[i], sarr[start] ,"+", sarr[end])
                counter+=1
                end-=1
                #print(sarr[i], end, start, sarr[start], sarr[end], counter)
            else:
                #decrement index end
                end-=1

        else:
            #decrement index of start
            start -= 1
            end = start - 1
        if start==0:
            #decrement index of i
            i-=1
            start = i-1
            end = start - 1
            #print(i, sarr[i], sarr[end], sarr[start], end)


    return counter,sarr


arr=[1,5,3,2,4]
print(countTripletsSortedArr(arr))
