'''
Array rotation

'''


def arrRotate(arr,rpoint):
    n = len(arr)
    if rpoint<=n:
        temp = arr[:rpoint-1]
        arr=arr[rpoint-1:]+temp
        return arr
    else :
        raise Exception


def arrRotateShifting(arr,rpoint):
    n=len(arr)
    tmp =arr[0]
    i =0
    j=0
    print(arr,j,tmp)
    while j<rpoint :
       if (i+1) < n:
         arr[i]=arr[i+1]
         print(arr)
         i+=1
       else :
           arr[n-1]=tmp
           tmp=arr[0]
           j+=1
           i=0
    return arr


arr=[1,2,3,4,5,6,7]
print(arrRotateShifting(arr,4))
