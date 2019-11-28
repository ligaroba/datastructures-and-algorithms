'''

A program to check if a binary tree is BST or not
A binary search tree (BST) is a node based binary tree data structure which has the following properties.
• The left subtree of a node contains only nodes with keys less than the node’s key.
• The right subtree of a node contains only nodes with keys greater than the node’s key.
• Both the left and right subtrees must also be binary search trees.

From the above properties it naturally follows that:
• Each node (item in the tree) has a distinct key.
'''


class Node():
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None

    #return true if Tree is BST
    def isBST(self,root,l=None,r=None):
        #Empty tree is a BST
        if root==None:
            return True

        #Check of the if the left node is less than the root node
        if l!=None and root.data<l.data:
            return False

        # Check of the if the right node is less than the root node
        if r != None and root.data < r.data:
            return False

        return self.isBST(root.left,l,root) and self.isBST(root.right,root,r)

root=Node(3)
root.left=Node(2)
root.right=Node(5)
root.left=Node(1)
root.right=Node(4)

head=Node(1)
head.left=Node(2)
head.right=Node(5)
head.left=Node(3)
head.right=Node(4)

if root.isBST(root):
    print ("Is BST")
else :
    print("Not BST")









