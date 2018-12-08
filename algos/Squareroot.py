from timeit import default_timer as timer

def sqroot(num):
    start =timer()
    print(float(round(start,4)))
    for i in range(1,100):
        div=int(num)/int(i)
        mod=num%i
        ##print( " test " + str(i) + " || " + str(int(div)) + " | |" +  str(mod))
        if (mod==0) and (int(div)==i) and i<num:#(i<int(num/3)):
            print(" Square root of " + str(num) + " = " + str(i))
            end = timer()
            print(float(round(end,4)))
            #print(round(float(end - start),3))
            return
        else :
            if i==num:
                end = timer()
                print(end)
                print(" No square root  " + str(num))



inum=33
sqroot(inum)