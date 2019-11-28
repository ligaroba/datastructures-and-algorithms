def maxSubsetSum(arr):
    # print(arr)
    # maxSum={}
    maxValue = []
    sum = 0
    for i in range(0, len(arr)):
        for y in range(int(i + 2), len(arr)):
            print(i, y)
            # if (str(i)+":"+str(y)) not in maxSum:
            # maxSum[str(i)+":"+str(y)]=int(arr[i]+arr[y])
            if int(y + 3) <= len(arr):
                sum = int(arr[i]) + int(arr[y]) + int(arr[y + 2])
            else:
                sum = int(arr[i]) + int(arr[y])

            if len(maxValue) > 0:
                if maxValue[0] < sum:
                  maxValue[0] = sum
            else:
                maxValue.append(sum)

    return maxValue[0]