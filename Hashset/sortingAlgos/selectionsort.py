#O(n^2)

def selection_sort(data):
    n=len(data)
    for i in range(0,n-1):
        minIndex=i
        for j in range(i+1,n):
            if data[j] < data[minIndex]:
                minIndex=j
            if minIndex!=i:
                data[j],data[minIndex]=data[minIndex],data[j]
    print(data)


data=[5,7,8,4,9,2,1]
selection_sort(data)
