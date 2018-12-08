def hasPairWithSum(data,sum):
    low=0
    high=len(data)-1

    while low<high:
        s=data[low]+data[high]
        if(s==sum):
            print(" Num " + str(s) + " sum  " + str(sum ) +" output " + "True")
            return
        else :
            low+=1
            print("False")


data1=[1,2,4,4]
data2=[1,2,3,9]
hasPairWithSum(data2,8)
