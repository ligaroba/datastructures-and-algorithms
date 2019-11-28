"""

ou are given  words. Some words may repeat. For each word, output its number of occurrences. The output order should correspond with the input order of appearance of the word. See the sample input/output for clarification.

Note: Each input line ends with a "\n" character.

Constraints:

The sum of the lengths of all the words do not exceed
All the words are composed of lowercase English letters only.

Input Format

The first line contains the integer, .
The next  lines each contain a word.

Output Format

Output  lines.
On the first line, output the number of distinct words from the input.
On the second line, output the number of occurrences for each distinct word according to their appearance in the input.

Sample Input

"""



from collections import OrderedDict
d = OrderedDict()
for _ in range (int(input())):
       word=str(input())
       d[word]=d.get(word,0)+1
string=""
print(len(d))
for key,value in d.items():
    string+=str(value) + " "
print(string)



from collections import Counter, OrderedDict
class OrderedCounter(Counter, OrderedDict):
    pass
d = OrderedCounter(input() for _ in range(int(input())))
print(len(d))
print(*d.values())


# deque
from collections import deque
d=deque()
string=""
for _ in range(int(input())):
    method,space,value = input().rpartition(' ')
    if method =="append":
        d.append(value)
    elif  method =="appendleft":
        d.appendleft(value)
d.pop()
d.popleft()



for elem in d:
    string+=str(elem)+" "
print(string)

# Alternative
print(*[elem for elem in d])



from collections import deque
d = deque()
for _ in range(int(input())):
    inp = input().split()
    getattr(d, inp[0])(*[inp[1]] if len(inp) > 1 else [])
print(*[item for item in d])












# !/bin/python3

import math
import os
import random
import re
import sys
import operator


def getCountUniqueSet(s, unique_values):
    lst = []
    for k, v in enumerate(unique_values):
        lst.append((v, s.count(v)))

    soe = sorted(lst, reverse=True, key=itemgetter(1, 0))
    lst1 = []
    lst2 = []
    for i, (k, v) in enumerate(soe[:3]):
        lst1.append(k)
        lst2.append(v)
    # print(lst2)
    slst1 = []
    n = len(lst2)
    for i in range(0, n - 1):
        # print(i,lst2[i])
        for j in range(i + 1, n):
            if lst2[i] == lst2[j]:
                unsorted = lst1[i:j + 1]
                sortedlst = lst1[0:1] + sorted(unsorted)
                mydic = dict(zip(sortedlst, lst2))
    for x in mydic.items():
        print(*x)


from collections import Counter, OrderedDict

class OrderedCounter(Counter, OrderedDict):
    pass
[print(*c) for c in OrderedCounter(sorted(input())).most_common(3)]