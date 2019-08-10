'''
Given a string, the task is to remove duplicates from it. Expected time complexity O(n) where n is length of
input string and extra space O(1) under the assumption that there are total 256 possible characters in a string.

Note: that original order of characters must be kept same.


Input:
2
geeksforgeeks
geeks for geeks

Output:
geksfor
geks for
'''

'''
Algorithm:

    Initialize a counter variable (keeps track of the characters visited in string),
    it is a 32 bit Integer represented as(00000000000000000000000000000000) initially.

    Consider ‘a’ as 0th bit of counter, ‘b’ as 1st bit of counter, ‘c’ as 2nd bit of counter and so on.

    Traverse through each character of input string.

    Get the character’s value, where character’s value(x) = Ascii of character – 97. This will make sure for value of ‘a’ as 0, value of ‘b’ as 1 and so on.
    Check xth bit of counter.

    If Xth bit of counter is 0 which means the current character has appeared for the
    first time, keep the current character at the index “length” of string .

    Mark the current character visited by setting xth bit of counter.
    Increment length.

   Return Substring of size “length” from index 0.

'''

# Function to remove duplicates
def removeDuplicatesFromString(str2):
    # keeps track of visited characters
    counter = 0;
    i = 0;
    size = len(str2);
    str1 = list(str2);
    # gets character value
    x = 0;
    # keeps track of length of resultant string
    length = 0;
    while (i < size):
        x = ord(str1[i])-97 ;
        print(counter , "     "  , x, str1[i])
        # check if Xth bit of counter is unset
        if ((counter & (1 << x)) == 0):
            str1[length] = chr(x+97);
            # mark current character as visited
            counter =counter |  (1 << x);
            length += 1;
        i += 1;

    str2 = ''.join(str1);
    return str2[0:length];
# Driver code
str1 = "geeksforgeeks";
print(removeDuplicatesFromString(str1));
