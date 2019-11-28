'''

Given two strings a and b. The task is to find if a string 'a' can be obtained by rotating another string 'b' by 2 places.

Input:
The first line of input contains an integer T
denoting the no of test cases. Then T test cases follow. In the next two line are two string a and b.
'''

def rotateString(stra,strb,isclockwise):
    n=len(stra)
    mid=int(n/2)


    if len(stra)!=len(strb):
        return False
    else:
        if isclockwise==True:
            if (stra[mid-1:n]+stra[0:mid-1])==strb:
              return True
            else:
                return False
        else :
            if (stra[0:mid-1]+stra[mid-1:n])==strb:
              return True
            else:
                return False


s="amazon"
s2="azonam"
print( rotateString(s,s2,True))
