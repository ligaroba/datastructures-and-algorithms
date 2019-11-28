'''
Your task is to implement the function strstr. The function takes two strings as arguments (s,x)
 and  locates the occurrence of the string x in the string s. The function returns and integer denoting the first occurrence of the string x in s.

Input Format:
The first line of input contains an integer T denoting the no of test cases .
Then T test cases follow. The first line of each test case contains two strings s and x.

Output Format:
For each test case, in a new line, output will be an integer denoting the
first occurrence of the x in the string s. Return -1 if no match found.

GeeksForGeeks Fr
GeeksForGeeks For
Output
-1
5

Explanation:
Testcase 1: Fr is not present in the string GeeksForGeeks as substring.
Testcase 2: For is present as substring in GeeksForGeeks from index 5.
:
'''

def fstrstr(s,x):
    n=len(s)
    n2=len(x)
    for i in range(n):
        if i<(n+1):
            j = i + n2
            print(s[i:j],x,i)
            if x ==(s[i:j]):
                return i
    return -1


s="GeeksForGeeks"
x="Fr"
s2="GeeksForGeeks"
x2="For"


print(fstrstr(s2,x2))