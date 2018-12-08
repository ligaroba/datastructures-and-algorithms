
#O(n^2 )



def bubble_sort(data):
    n=len(data)
    print(str(n))
    for i in range(0,n-1):
        print("outer loop " + str(i))
        for j in range(0,n-1-i):
            print("inner loop " +str(j))
            if data[j]>data[j+1]:
                data[j + 1],data[j]=data[j],data[j+1]
            else :
             break
    print(data)

data=[5,7,8,4,9,2,1]
bubble_sort(data)