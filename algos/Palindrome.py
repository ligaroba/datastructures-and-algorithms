def reverse(s):
    print(s[::-1])
    return s[::-1]#O(1)

def palindrome(s):
    rev=reverse(s)
    if s==rev:
        print("True")#O(1)
    else :
        print("False") #O(1)




def  recusPalindrome(word,start,end):
     if start==end:
         return True
     elif word[start]!=word[end]  :
         #print("False: word[start] : " + word[start] + " word[end]: " + word[end])
         return False
     elif (start<end+1):
         print("recusPalindrome: word[start] : " + word[start] +" word[end]: " +word[end] +" "+ word + " start : " + str(start) + " end : " + str(end))
         return recusPalindrome(word,start+1,end-1)


def isPalindrome(word):
    n =len(word)
    if n==0:
        return True
    else:
        print("isPalindrome: " + word + " n : " + str(n) )
        return recusPalindrome(word,0,n-1)





s="abbba"
s2="malayyyalam"
s3="kabisa"
#palindrome(s3)

#print(isPalindrome(s2))
if isPalindrome(s2) or isPalindrome(s)==None :
    print("True")
else:
    print("Falsee")


palindrome(s2)