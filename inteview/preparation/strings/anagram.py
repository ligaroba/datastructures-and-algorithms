'''
Given two strings a and b consisting of lowercase
characters. The task is to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input:
The first line of input contains an integer T denoting the number of test cases.
Each test case consist of two strings in 'lowercase' only, in a single line.


Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO

Explanation:
Testcase 1: Both the string have same characters with same frequency. So, both are anagrams.
Testcase 2: Characters in both the strings are not same, so they are not anagrams.
'''

def areAnagram(str1,str2):
    if len(str1)!=len(str2):
        return False
    else:
        value=0
        for i in range(len(str1)):
            value=value^ord(str1[i])
            value = value ^ ord(str2[i])
        if value==0:
            return True
        return  False


def anagram(stra,strb):
    straDict={}


    if len(strb)!=len(stra):
        return False
    else:
        for i in range(0,len(stra)):
            if stra[i] in straDict:
                straDict[stra[i]]+=1
            else:
                straDict.update({stra[i]:1})

        for i in range(0,len(strb)):
            if stra[i] in straDict:
                if straDict[stra[i]]!=0:
                    straDict[stra[i]]-=1
                else : return False
            else:
                return False
    print("test", straDict)
    return True


s1="allergy"
s2="allergic"
s12="geeksforgeeks"
s13="forgeeksgeeks"
#print(anagram(s12,s13))
print(areAnagram(s12,s13))
