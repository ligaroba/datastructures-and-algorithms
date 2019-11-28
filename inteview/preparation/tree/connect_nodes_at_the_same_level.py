
'''
https://www.geeksforgeeks.org/connect-nodes-at-same-level/
'''

class Node:
    def __init__(self,data):
        self.right=None
        self.left=None
        self.data=data
        self.nextRight=None

class Tree:
    def connectNodes(self,root):
        q=list()
        if root is None :
            return
        q.append(root)
        q.append(None)

        while q is not None:
            temp=q.pop(0)
            if temp:
                temp.nextRight=q[0]
                if temp.left:
                    q.append(temp.left)
                if temp.right:
                    q.append(temp.right)
            else:
                q.append(None)


root =Node(20)
root.left = Node(8)
root.right =Node(22)
root.left.left = Node(5)
root.left.right = Node(3)
root.right.left = Node(4)
root.right.right =Node(25)
root.left.right.left =  Node(10)
root.left.right.right = Node(14)

tree=Tree()
tree.connectNodes(root)

