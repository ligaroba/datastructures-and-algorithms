''''
Given a undirected graph, the task is to complete the method isCyclic() to detect if there is a cycle in the undirected graph or not.

Input:
The first line of the input contains an integer 'T' denoting the number of test cases. Then 'T' testcases follow. Each testcase consists of two lines. Description of testcases are as follows: The First line of each testcase contains two integers 'N' and 'M' which denotes the no of vertices and no of edges respectively. The Second line of each test case contains 'M'  space separated pairs u and v denoting that there is a bidirectional  edge from u to v .

Output:
The method should return 1 if there is a cycle else it should return 0.

User task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function isCyclic.

'''


def detect_cycle_graph(adjList):
     stack=[]
     stack.append('0')
     parent=-1
     visited=[]

     while len(stack)>0:
         sitem=stack.pop(len(stack)-1)
         parent=sitem
         lnode=len(adjList.get(sitem))
         if lnode>0:
             for i in range(lnode):
                 #check if the children are visited if not add them to stack
                 if adjList.get(sitem)[i] not in visited:
                     stack.append(i)
                 else :#if not viisted check they share the same parent
                    if parent!=sitem:
                        return 1
     return 0












adjList={'0':(1,2,3),
         '1':(0,2),
         '2':(0,1),
         '3':(0,4),
         '4':(3)}

print(detect_cycle_graph(adjList))



