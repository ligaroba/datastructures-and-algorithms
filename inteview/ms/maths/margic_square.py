
import numpy as np
import math
def getMatrix(rows,cols):
    if rows==cols:
        arr=[[-1 for i in range(cols)] for j in range(rows)]
        mat=np.array(arr)
        return mat
    else: return

def getMargixSuare(rows,cols):
    mat=getMatrix(rows, cols)
    n=mat.shape[0]
    sum=(n*(n**2+1))/2
    pos=round(n*0.5)
    prevpos=(0,pos-1)
    i=0
    k=1
    j=pos-1
    mat[0][pos-1]=k
    #print("before -0", prevpos)
    while k<=(n*n):
        k=k+1
        if n%2!=0:
            # move up i.e i and move right i.e j and if i<0 then make i=(n-1) then move j to the right by 1 and
            # Place the value there
            #print(i,j,k,prevpos)
            print(mat)
            if (i - 1) < 0:
                i = n - 1
                if (j+1)<=(n-1):
                    j += 1
                else:
                    j=0
                if mat[i][j] == -1:
                    mat[i][j] = k
                    prevpos = (i, j)
                else:
                    #print("before 0", prevpos)
                    i = prevpos[0] + 1
                    j = prevpos[1]
                    mat[i][j] = k
                    prevpos = (i, j)
                    #print("after 0", prevpos)
            elif (i-1)>=0 and (j+1)>(n-1):
                j=0
                i-=1
                if mat[i][j] == -1:
                    mat[i][j] = k
                    prevpos = (i, j)
                else:
                    #print("before",prevpos)
                    i = prevpos[0] + 1
                    j = prevpos[1]
                    mat[i][j] = k
                    prevpos = (i, j)
                    #print("after", prevpos)

            elif (i-1)>=0 and (j+1)<=(n-1):
                j+=1
                i-=1
                print(prevpos)
                if mat[i][j] == -1:
                    mat[i][j] = k
                    prevpos = (i, j)
                else:
                    i=prevpos[0] + 1
                    j=prevpos[1]
                    mat[i][j] = k
                    prevpos = (i, j)



    return mat

print(getMargixSuare(3,3))