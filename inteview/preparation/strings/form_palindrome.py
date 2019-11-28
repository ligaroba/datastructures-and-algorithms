


def formPalindrome(s):
    n=len(s)
    lastStr=n-1
    counter=0
    if s==s[::-1]:
        return counter
    else:
        for i in range(n):
            s+=s[lastStr-1:lastStr]
            lastStr-=1
            if s!=s[::-1]:
                counter+=1
        return counter,s

s="abcd"
s2="aba"
s3="geeks"
s4="abede"
print(formPalindrome(s4))
