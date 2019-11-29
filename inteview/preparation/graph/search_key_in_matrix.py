''''



'''

import numpy as np

def searchMatrix(arr,key):
    mat=np.array(arr)
    n=mat.shape
    visited=[]
    queue=[]
    i=j=0
    queue.append((i,j))

    while len(queue)>0:
        qitem=queue.pop(0)
        curr_i=qitem[0]
        curr_j=qitem[1]
        if mat[curr_i,curr_j]==key:
            return True
        else :
            if qitem not in visited:
                if curr_i+1>=0 and curr_i+1<n[0]:
                    queue.append((curr_i+1,curr_j))
                if curr_j+1 >= 0 and curr_j+1 < n[1]:
                    queue.append((curr_i , curr_j+1))

                if curr_j-1 >= 0 and curr_i-1 >=0:
                    queue.append((curr_i-1 , curr_j-1))

                if curr_i-1 >= 0 and curr_i-1<n[0]:
                    queue.append((curr_i-1 , curr_j))

                if curr_j-1 >= 0 and curr_j-1<n[1]:
                    queue.append((curr_i , curr_j-1))

                visited.append((curr_i,curr_j))
    print(visited)
    return False







arr=[
    [1,22,3,4,5],
    [9,48,56,13,12],
    [6, 8, 15, 23, 32],
    [19, 78, 26, 11, 10],
    [39, 27, 17, 24, 20]
]

print(171,searchMatrix(arr,171))
print(17,searchMatrix(arr,17))
print(15,searchMatrix(arr,15))