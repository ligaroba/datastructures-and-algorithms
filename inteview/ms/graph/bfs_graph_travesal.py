''''


Graph Traversal
'''


class  Graph:
    def __init__(self,data):
         self.data=data
         self.left=None
         self.right=None





def bfs_travesal(root):
    q=[]
    q.append(root)
    res=''
    visited = set()
    while len(q)>0:
        item=q.pop()
        if item.data not in visited:
            if item.left !=None:
                q.append(item.left)
            if item.right !=None :
                q.append(item.right)
            res += str(item.data) + " "
            visited.add(item.data)
    return res,visited


root=Graph(1)
root.left=Graph(2)
root.right=Graph(3)
root.right.right=Graph(4)
root.right.left=Graph(5)
root.left.right=Graph(6)
root.left.right.left=Graph(7)
root.right.right.right=Graph(8)
root.right.right.left=Graph(9)
root.left.left=Graph(10)
root.left.left.right=Graph(11)

print(bfs_travesal(root))



