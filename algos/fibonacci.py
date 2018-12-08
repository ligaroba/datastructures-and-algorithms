
"""
We can use the earlier pattern we'd established for recursive calls: O( branches^depth).
There are 2 branches per call, and we go as deep as N, therefore the runtime is O( 2
N).
 
 """

def fib(num):
    if(num<=0):
        return 0
    elif num==1 :
      return 1
    else :
        return fib(num-1) + fib(num-2)

num=9
print(fib(num))
