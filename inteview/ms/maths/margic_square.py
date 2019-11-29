
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
    print("\n")
    print("Margic square of  : ",rows,"x", cols)
    n=mat.shape[0]
    sum=(n*(n**2+1))/2
    pos=round(n*0.5)
    prevpos=(0,pos-1)
    i=0
    k=1
    j=pos-1
    mat[0][pos-1]=k
    while k<=(n*n):
        k=k+1
        if n%2!=0:
            # move up i.e i and move right i.e j and if i<0 then make i=(n-1) then move j to the right by 1 and
            # Place the value (k) there
            if (i - 1) < 0:
                i = n - 1
                if (j+1)<=(n-1):
                    j += 1
                else:
                    j=0
                #if the value at that location if it has not been modified place the value  (k) there
                if mat[i][j] == -1:
                    if i < n and j < n:
                        mat[i][j] = k
                        prevpos = (i, j)

                # if their is an existing value in that location go back to the previous location
                # and place the value (k) in the cell below it i.e increment i by 1
                else:
                    i = prevpos[0] + 1
                    j = prevpos[1]
                    if i < n and j < n:
                        mat[i][j] = k
                        prevpos = (i, j)
            # If moving up is within matrix and right goes out of the matrix reset j to zero place the value  (k) there
            elif (i-1)>=0 and (j+1)>(n-1):
                j=0
                i-=1
                if mat[i][j] == -1:
                    if i < n and j < n:
                        mat[i][j] = k
                        prevpos = (i, j)

                else:
                    i = prevpos[0] + 1
                    j = prevpos[1]
                    if i < n and j < n:
                        mat[i][j] = k
                        prevpos = (i, j)

            # If moving up and right one step is within the matrix place the value  (k) there
            elif (i-1)>=0 and (j+1)<=(n-1):
                j+=1
                i-=1
                if mat[i][j] == -1:
                    if i < n and j < n:
                        mat[i][j] = k
                        prevpos = (i, j)
                else:
                    i=prevpos[0] + 1
                    j=prevpos[1]
                    if i<n and j<n:
                        mat[i][j] = k
                        prevpos = (i, j)


    print("Sum : ", int(sum))
    return mat

print(getMargixSuare(7,7))
print(getMargixSuare(3,3))