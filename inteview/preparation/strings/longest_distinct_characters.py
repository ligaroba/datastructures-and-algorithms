'''

Given a string S, find length of the longest substring with all distinct characters.
For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is String str.

Output:
Print length of smallest substring with maximum number of distinct characters.
Note: The output substring should have all distinct characters.
'''

def LSC(s):
    n=len(s)
    res=set()
    for i in range(n):
        res.add(s[i])
    return len(res),res

s="abababcdefababcdab"
s2="geeksforgeeks"
print(LSC(s2))


'''
Method two: Print Longest substring without repeating characters

Approach: The idea is to traverse the string and for each already visited character store its last occurrence
in a hash table(Here unordered_map is used as hash with key as character and value as its last position).
The variable st stores starting point of current substring, maxlen stores length of maximum length substring and
start stores starting index of maximum length substring. While traversing the string, check whether current
character is present in hash table or not. If it is not present, then store current character in hash table
with value as current index. If it is already present in hash table, this means the current character could
repeat in current substring. For this check if the previous occurrence of character is before or after the
starting point st of current substring. If it is before st, then only update the value in hash table.
If it is after st, then find length of current substring currlen as i-st, where i is current index.
Compare currlen with maxlen. If maxlen is less than currlen, then update maxlen as currlen and start as st.
After complete traversal of string,
the required longest substring without repeating characters is from s[start] to s[start+maxlen-1].
'''



# substring without repeating characters.

# Function to find and print longest
# substring without repeating characters.
def findLongestSubstring(string):
    n = len(string)

    # starting point of current substring.
    st = 0

    # maximum length substring without
    # repeating characters.
    maxlen = 0

    # starting index of maximum
    # length substring.
    start = 0

    # Hash Map to store last occurrence
    # of each already visited character.
    pos = {}

    # Last occurrence of first
    # character is index 0
    pos[string[0]] = 0

    for i in range(1, n):

        # If this character is not present in hash,
        # then this is first occurrence of this
        # character, store this in hash.
        if string[i] not in pos:
            pos[string[i]] = i

        else:
            # If this character is present in hash then
            # this character has previous occurrence,
            # check if that occurrence is before or after
            # starting point of current substring.
            if pos[string[i]] >= st:

                # find length of current substring and
                # update maxlen and start accordingly.
                currlen = i - st
                if maxlen < currlen:
                    maxlen = currlen
                    start = st

                    # Next substring will start after the last
                # occurrence of current character to avoid
                # its repetition.
                st = pos[string[i]] + 1

            # Update last occurrence of
            # current character.
            pos[string[i]] = i

            # Compare length of last substring with maxlen
    # and update maxlen and start accordingly.
    if maxlen < i - st:
        maxlen = i - st
        start = st

        # The required longest substring without
    # repeating characters is from string[start]
    # to string[start+maxlen-1].
    return string[start: start + maxlen]


# Driver Code
if __name__ == "__main__":
    string = "GEEKSFORGEEKS"
    print(findLongestSubstring(string))

