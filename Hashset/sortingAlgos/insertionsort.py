#O(n^2)

def insertion_sort(data):
    n=len(data)
    for i in range(0,n):
        for j in range(i-1,-1,-1):
            if data[j]>data[j+1]:
                data[j],data[j+1]=data[j+1], data[j]
            else:
                break
    print(data)


def insertion_sort_while(data):
    n=len(data)
    for i in range(0,n):
        j=i-1
        #print(str(j))
        while data[j]>data[j+1] and j>=0:
            data[j], data[j + 1] = data[j + 1], data[j]
            j-=1

    print(data)

def insertion_sort_with_curnum(data):
    n=len(data)
    for i in range(0,n):
        curNum=data[i]
        for j in range(i-1,-1,-1):
            if data[j]>curNum:
                data[j+1]=data[j]
            else :
                data[j+1]=curNum
                break
    print(data)


data=[5,7,8,4,9,2,1]
insertion_sort(data)
insertion_sort_while(data)
insertion_sort_with_curnum(data)