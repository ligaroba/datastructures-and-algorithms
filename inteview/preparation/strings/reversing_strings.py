'''
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
'''

def reverseString(s):
    arr=s.split('.')
    res=''
    size=len(arr)-1
    i=size
    while i>-1:
        if i==0:
            res+=arr[i]
        else :
            res+=arr[i]+'.'
        i-=1
    return res



s='i.like.this.program.very.much'

print(reverseString(s))

