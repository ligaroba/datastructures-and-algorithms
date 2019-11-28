'''

Given a string S. The task is to print all permutations of a given string.

Input:
The first line of input contains an integer T, denoting the number of test cases.
 Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a
 given string S with single space and all permutations should be in lexicographically increasing order.

ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA

Explanation:
Testcase 1: Given string ABC has permutations in 6 forms as ABC, ACB, BAC, BCA, CAB and CBA .
'''

import re
def permute2(s,choosen):
    choosen=''
    #print("permute("+s+","+choosen+")")
    if s=='':

        return choosen

    else:
        for i in s:
            #print(choosen)
            choosen+=i
            #print(choosen)
            s=re.sub(i,'',s,1)
            print(s)
            permute2(s,choosen)
            # unchoose
            s+=i
            #print(s)
            choosen=re.sub(i,'',choosen,1)


#working solution
def permute(s,l,r):

    print("permute("+str(s)+","+str(l)+","+str(r)+")")

    if l==r:
        print (str(s))
        print("endl",l,r)
    else :
        for i in range(l,r+1):
            print("Before s[l] =", s[l], "s[i]=", s[i], "l=", l, "i=", i, "i+1= ", l + 1)
            s[l],s[i]=s[i],s[l]
            print("After s[l] =", s[l], "s[i]=", s[i], "l=", l, "i=", i, "i+1= ", l + 1)
            permute(s,l+1,r)
            print("Test",l,i,s[l], s[i])
            s[l], s[i] = s[i], s[l] #backtrack




def runPemute(s):
    permute(s," ")

s="MARTY"
s2="GOOGLE"
s3= "ABC"
s4="ABCD"
n = len(s3)
a = list(s3)

permute(a, 0, n-1)
#print(runPemute(s2))

#print(s[0:])




