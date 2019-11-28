'''
Your task  is to implement the function atoi. The function takes a string(str) as
argument and converts it to an integer and returns it.

Input:
The first line of input contains an integer T denoting the no of test cases .
 Then T test cases follow. Each test case contains a string str .

 Input:

123
21a

Output:
123
-1

'''
def isNumber(s):
    if s>='0' and s<='9':
        return True
    return False


def isNumericChar(x):
    if (x >= '0' and x <= '9'):
        return True
    return False


def myAtoi(string):
    if len(string) == 0:
        return 0

    res = 0
    # initialize sign as positive
    sign = 1
    i = 0

    # if number is negative then update sign
    if string[0] == '-':
        sign = -1
        i += 1

    # Iterate through all characters of input string and update result
    for j in range(i, len(string)):
        # You may add some lines to write error message to error stream
        if isNumericChar(string[j]):
            return 0

        res = res * 10 + (ord(string[j]) - ord('0'))

    return sign * res


# Driver program
string = "-134"
print(myAtoi(string))



def atoi(s,idx):
    n=len(s)
    i=idx
    sign=1
    res=0
    if i<n:
        if s[i]==" ":
            i+=1
        elif s[i]=="-":
            sign=-1
            i+=1
        else:
            if isNumber(s[i]):
                #res=res+s[i]
                res = res * 10 + (ord(s[i]) - ord('0'))
                print("test2", res, i)
                i+=1
            else : return False

        atoi(s, i)
    else:
        print("test",res,sign)
        res*=sign
    return res

s=" -183"
print(atoi(s,0))



