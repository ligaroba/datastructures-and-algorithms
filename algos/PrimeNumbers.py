

def prime_number(num):
    i=2
    while i*i<=num:
        if(num%i)==0:
            return False
        i+=1
    return True


num=10
if prime_number(num):
    print("Prime number")
else :
    print("Not Prime")