'''

Given an array you nee to take all the non zeros to the left and maintain the
order of zeros
'''



def push_zeros_to_the_left(in_arr):
    currIndex=0
    prevIndex=-1
    currIndexOfZero=-1
    currIndexOfNonZero=-1

    for i in range(0,len(in_arr)):
        if (i+1)<len(in_arr):
            if in_arr[i]>0 and in_arr[i+1]==0:
                    in_arr[i+1],in_arr[i]=in_arr[i],in_arr[i+1]
                    if currIndexOfNonZero ==-1:
                        currIndexOfNonZero=i
                        print(currIndexOfNonZero)
                    currIndexOfZero=i

                    print("in arr : " + str(in_arr), currIndexOfNonZero,currIndexOfZero)
        if currIndexOfZero>currIndexOfNonZero:
                #print(currIndexOfNonZero,currIndexOfZero,i)
                in_arr[currIndexOfZero],in_arr[currIndexOfNonZero]=in_arr[currIndexOfNonZero], in_arr[currIndexOfZero]
                currIndexOfNonZero+=1
                print(currIndexOfNonZero,currIndexOfZero)
                #print("out arr : " + str(in_arr),i)


    return in_arr





def push_zeros_to_right(in_arr):
    currZeroIndex=-1
    for i in range(0,len(in_arr)):
       if (i+1)<int(len(in_arr)+1):
            if in_arr[i]==0:
                if currZeroIndex==-1:
                    currZeroIndex=i
                elif currZeroIndex>i:
                    currZeroIndex = i
                print("currZeroIndex : " + str(currZeroIndex))
            elif in_arr[i]>0 and currZeroIndex!=-1 :
                 print("i " + str(i) + " pos : " + str(in_arr[i]))
                 if in_arr[currZeroIndex+1]==0:
                     in_arr[currZeroIndex],in_arr[currZeroIndex+1],currZeroIndex,in_arr[i]=in_arr[i],in_arr[currZeroIndex],currZeroIndex+1,in_arr[currZeroIndex+1]
                 else :
                     in_arr[currZeroIndex],in_arr[i],currZeroIndex=in_arr[i],in_arr[currZeroIndex],i
    return in_arr
arr=[1,0,0,0,2,0,4,3]
print(push_zeros_to_the_left(arr))
#print(push_zeros_to_right(arr))