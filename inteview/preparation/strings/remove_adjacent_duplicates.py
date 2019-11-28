'''
Given a string s, recursively remove adjacent duplicate characters from the string s.
 The output string should not have any adjacent duplicates.


Input:
The first line of input contains an integer T, denoting the no of test cases.
Then T test cases follow. Each test case contains a string str.
Example:
Input:
2
geeksforgeek
acaaabbbacdddd

Output:
gksforgk
acac
'''

def adjacentDups(s):
    n=len(s)
    k=n-1
    j = k - 1
    for i in range(n-1):
        #j = k - 1
        print(i,k,j)
        if j > 0:
            print(len(s), s, k, j,s[k],s[j])
            if s[j]==s[k]:
                tmp=s[k+1:]
                s=s[0:j]
                s+=tmp
                j-=2
                k-=2
                #print("len " , len(s),s,s[j], s[k],k,j)
            else:
                j-=1
                k-=1
                print("here", s,j,k)
    return s

s="acaaabbbacdddd"
s2="geeksforgeek"
s3="mississipie"

print("final ", adjacentDups(s3))
#print(s[:1])
