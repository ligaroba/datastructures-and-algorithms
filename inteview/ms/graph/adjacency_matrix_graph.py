
#creating a empty 2D matrix
def initialize_empty_matrix(size):
    A=[]
    for i in range(0, size):
        A.append(0)
    for i in range(0,len(A)):
        A[i] = [0 for i in range(0,size)]
    return A

arr=initialize_empty_matrix(10)
def dEdges(i,j):
    arr[i][j]=1
    return arr



dEdges(0,2)
dEdges(1,2)
dEdges(3,2)
dEdges(4,2)
dEdges(1,5)
dEdges(1,6)
dEdges(1,3)
dEdges(1,1)

print(arr)


