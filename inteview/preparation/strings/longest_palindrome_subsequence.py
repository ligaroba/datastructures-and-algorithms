'''

Given a string S, find the longest palindromic substring in S.
Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index ).

NOTE: Required Time Complexity O(n2).

aaaabbaa

Output:
aabbaa

Explanation:
Testcase 1: The longest palindrome string present in the given string is "aabbaa".


     // Every single character is a palindrome of length 1
    L(i, i) = 1 for all indexes i in given sequence

    // IF first and last characters are not same
    If (X[i] != X[j]) L(i, j) = max{L(i + 1, j), L(i, j – 1)}

    // If there are only 2 characters and both are same
    Else if (j == i + 1) L(i, j) = 2

    // If there are more than two characters, and first
    // and last characters are same
    Else L(i, j) = L(i + 1, j – 1) + 2
'''
from numpy import *
def maxValue(x,y):
    if x>y:
        return x
    else:
        return y




'''
time complexity : O(n*n)
space complexity : O(n*n)
'''
def optimized_lps(s):
    n = len(s)

    # a[i] is going to store length
    # of longest palindromic subsequence
    # of substring s[0..i]
    a = [0] * n

    # Pick starting point
    for i in range(n - 1, -1, -1):
        back_up = 0

        # Pick ending points and see if s[i]
        # increases length of longest common
        # subsequence ending with s[j].
        for j in range(i, n):

            # similar to 2D array L[i][j] == 1
            # i.e., handling substrings of length
            # one.
            if j == i:

                a[j] = 1
                # Similar to 2D array L[i][j] = L[i+1][j-1]+2
                # i.e., handling case when corner characters
                # are same.
                print("i=",i,"j=",j,a)
            elif s[i] == s[j]:
                temp = a[j]
                a[j] = back_up + 2
                back_up = temp
                print("i=",i,"j= ", j, "a[j]=",a[j],"temp" ,temp,"back_up = ",back_up,"s[j]=",s[j],"s[i]= ",s[i],"a=",a)

                # similar to 2D array L[i][j] = max(L[i][j-1],
                # a[i+1][j])
            else:
                back_up = a[j]
                a[j] = max(a[j - 1], a[j])

    return a[n - 1]


# Driver Code
string = "GEEKSFORGEEKS"
string2="abaabc"
print(optimized_lps(string2))

def longestPalindrome(s):

    size=len(s)
    LPS=[[0 for x in range(size)] for x in range(size)]#[[0]*size]*size
    n=len(LPS)

    for i in range(n):
        LPS[i][i]=1

    #else:
    for j in range(2,size+1):
        test=n-j+1
        for i in range(n-j+1):
          k=j+i-1
          print("(i,k) = (",i+1,",",k-1,")"," j=",j,"(i,k) = (",i,",",k,")", "n-j+1 = ",test,"n=",n)
          if s[i]==s[k]:
                 LPS[i][k]=LPS[i+1][k-1]+2
          elif s[i]==s[k] and j==2:
                 LPS[i][k] =2
          else:
                 LPS[i][k]=maxValue(LPS[i][k-1],LPS[i+1][k])

    print(array(LPS))



s="aabbaa"
seq3="BBABCBCAB"
s2="forgeeksskeegfor"
#print(longestPalindrome(seq3))



'''
time complexity : O(n*n)
space complexity : O(n*n)
'''
def lps(str):
    n = len(str)

    # Create a table to store results of subproblems
    L = [[0 for x in range(n)] for x in range(n)]

    # Strings of length 1 are palindrome of length 1
    #filling the diagonal of a matrix
    for i in range(n):

        L[i][i] = 1



    # Build the table. Note that the lower
    # diagonal values of table are
    # useless and not filled in the process.
    # The values are filled in a
    # manner similar to Matrix Chain
    # Multiplication DP solution (See

    # cl is length of substring
    for cl in range(2, n + 1):
        for i in range(n - cl + 1):
            j = i + cl - 1

            if str[i] == str[j] and cl == 2:
                L[i][j] = 2
            elif str[i] == str[j]:
                L[i][j] = L[i + 1][j - 1] + 2
            else:
                L[i][j] = max(L[i][j - 1], L[i + 1][j]);
    print(array(L))
    return L[0][n - 1]


# Driver program to test above functions
seq = "GEEKS FOR GEEKS"
seq2="forgeeksskeegfor"
seq3="BBABCBCAB"
n = len(seq3)
#print("The length of the LPS is " + str(lps(seq3)))