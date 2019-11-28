

from numpy import *

def spiralTraverse(arr):
    n=len(arr)
    m=len(arr[0])
    res=''
    i=0

    for j in range(0,m):
       res+=str(arr[i,j]) + " "

    for k in range(1, m):
        res += str(arr[k,m-1]) + " "

    for l in range(m-1,0,-1):
        res += str(arr[n-1,l-1]) + " "

    for x in range(m - 1, 1, -1):
        res += str(arr[n - 1, l - 1]) + " "


    return res


arr=array([[1, 2, 3 ,4],
     [5, 6, 7, 8],
     [9, 10, 11, 12],
     [13, 14, 15, 16]
     ])


print(spiralTraverse(arr))