'''
Write an efficient function that checks whether any permutation ↴ of an input string is a palindrome. ↴

'''

def check_if_string_permutaion_palindrome(s):
    cache=set()
    for char in s:
        if char in cache:
            cache.remove(char)
        else:
            cache.add(char)
    print(cache)
    return len(cache)<=1


s='carerac'
print(check_if_string_permutaion_palindrome(s))