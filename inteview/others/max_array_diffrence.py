''''
Question 2: Write a function which accepts an integer array and
its size and returns the maximum index difference i.e.
(i-j) such that array[i] < array[j] and i < j. If there is no such case, return -1 .
'''


def maxArrayDiff(arr,size):
    memo=[] #For storing max value as we iterate
    for i in range (0,size):
        #handle array out of bound exceptions
        if (i+1)<size:
            #check for array diffrence
            if arr[i]<arr[i+1]:
                diff=(arr[i+1]-arr[i])
                if len(memo)>0:
                   if memo[0] < diff:
                       memo[0]=diff #((i+1)-i)

                   else:
                       memo[0]=-1
                else:
                    memo.append(diff)
            else:
                memo.append(-1)


    return memo[0]


'''
Application areas:

Stock Buy Sell to Maximize Profit

The cost of a stock on each day is given in an array, find the max profit
that you can make by buying and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and
sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
'''

def maxDiff(arr, arr_size):
    max_diff = arr[1] - arr[0]
    min_element = arr[0]
    min_index=0
    max_index=0

    for i in range(1, arr_size):
        if (arr[i] - min_element > max_diff):
            max_diff = arr[i] - min_element
            max_index=i

        if (arr[i] < min_element):
            min_element = arr[i]
            min_index=i
    return max_diff,max_index,min_index


testcase1=[8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1]
testcase2=[9,8,7,6,5]
testcase3 = [1, 2, 90, 10, 110]
testcase4=[100, 180, 260, 310, 40, 535, 695]
size=len(testcase4)
print(maxDiff(testcase4,size))

print(int(695-40))