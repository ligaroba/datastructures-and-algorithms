



import sys
import numpy as np


# Matrix Ai has dimension p[i-1] x p[i] for i = 1..n
def MatrixChainOrder(p, n):
    # For simplicity of the program, one extra row and one
    # extra column are allocated in m[][].  0th row and 0th
    # column of m[][] are not used
    m = [[0 if i<j else -1 for j in range(n)] for i in range(n)]

    # m[i,j] = Minimum number of scalar multiplications needed
    # to compute the matrix A[i]A[i+1]...A[j] = A[i..j] where
    # dimension of A[i] is p[i-1] x p[i]

    # cost is zero when multiplying one matrix.
    for i in range(1, n):
        m[i][i] = 0

    # L is chain length.
    for L in range(2, n):
        for i in range(1, n - L + 1):
            j = i + L - 1
            m[i][j] = sys.maxsize
            #print(np.array(m))
            for k in range(i, j):

                # q = cost/scalar multiplications
                q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]
                if q < m[i][j]:
                    m[i][j] = q
    print(np.array(m))
    return m[1][n - 1]

def MCM(arr):
    size=len(arr)
    m = [[0 if i<j else -1 for j in range(size)] for i in range(size)]
    for i in range(size):
        m[i][i]=0

    for L in range(2,len(arr)):
        # Get Max pairs of matrices to be multiplied = size-L-1
        for i in range(size-L+1):
            j=i+L-1
            m[i][j]=100000*100000
            print(j,L,i)
            for k in range (i,j):
                 m[i][j] = min(m[i][k]+ m[k+1][j]+ arr[i-1]*arr[k+1]*arr[j],m[i][j])



    print(np.array(m))
    return m[0][len(arr)-1]





arr=[40,20,30,10,30]
arr2=[3,4,5,6,2,5]
print(MCM(arr2))

#print(MatrixChainOrder(arr2,len(arr2)))





