

# A Utility Function to find the common
# prefix between first and last strings
def commonPrefixUtil(str1, str2):
    n1 = len(str1)
    n2 = len(str2)


    result = ""

    # Compare str1 and str2
    j = 0
    i = 0
    while (i <= n1 - 1 and j <= n2 - 1):
        if (str1[i] != str2[j]):
            break
        result += (str1[i])


        i += 1
        j += 1

    return (result)


# A Function that returns the longest
# common prefix from the array of strings
def commonPrefix(arr, n):
    # sorts the N set of strings
    arr.sort(reverse=False)
    print(arr[0])

    # prints the common prefix of the first
    # and the last string of the set of strings
    print(commonPrefixUtil(arr[0], arr[n - 1]))


# Driver Code
if __name__ == '__main__':
    arr = ["geeksforgeeks", "geeks",
           "geek", "geezer"]
    arr2=["apple","ape","april"]
    n = len(arr2)

    commonPrefix(arr2, n)


