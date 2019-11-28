#https://www.hackerrank.com/challenges/py-collections-deque/forum

# # deque
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
# Alternative
print(*[elem for elem in d])


from collections import deque
q, cs = deque(), [input().split() for _ in range(int(input()))]
[getattr(q, c[0])() if len(c) == 1 else getattr(q, c[0])(c[1]) for c in cs]
print(" ".join(q))

#VS
from collections import deque
q, cs = deque(), [input().split() for _ in range(int(input()))]
[getattr(q, c)(*args) for c, *args in cs]
print(" ".join(q))"""

list =('BANANA FRIES', ' ', '12')
print(*list)

