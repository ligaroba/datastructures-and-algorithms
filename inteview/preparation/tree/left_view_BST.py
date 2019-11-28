'''

Print Left View of a Binary Tree

Given a Binary Tree, print left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from left side.


'''

class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None

class BST:
    def height(self,root):
        if root is not None:
            return
        else:
            lheight=self.height(root.left)
            rheight=self.height(root.right)
        print(lheight)

        if lheight>rheight:
            return lheight+1
        else:
            return rheight+1

    def levelOrderTraversal(self,root):
        if root is not None:
            return

    def leftView(self,root,):
        print("None")



root=Node(12)
root.left=Node(10)
root.right=Node(14)
root.left.right=Node(11)
root.left.left=Node(9)
root.right.left=Node(13)
root.right.right=Node(15)
print(root)

tree=BST()
print(tree.height(root))