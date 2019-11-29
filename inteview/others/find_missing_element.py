
def find_missing_elemnt(arr):
    num=set()
    for i in range(0,len(arr)):
        print((i+1),arr[i])
        if (i+1) !=arr[i]:
            num.add(i)
            print(num)
        if arr[i] in num:
               num.remove(arr[i])
               print("data " + str(num))
    return num

def find_missing(arr):
    num=set()
    for i in range(0,len(arr)):
        if (i+1) not in arr:
            num.add(i+1)
    return num


def getMissingNo(a, n):
    x1 = a[0]
    x2 = 1


    for i in range(1, n):
        x1 = x1 ^ a[i]
        #print("test",x1,x1 ^ a[i],a[i])

    for i in range(0, n):

        x2 = x2 ^ i

    return x1 ^ x2

#x1=1^2^4^5^6
#x2=1^2^3^4^5^6
#print(x1)

# Driver program to test above function
if __name__ == '__main__':
    a = [1, 2, 4, 5, 6,7]
    n = len(a)
    miss = getMissingNo(a, n)
    print(miss)

# This code is contributed by Yatin Gupta






#in_arr=[1,2,6,5,3]
#print(find_missing(in_arr))