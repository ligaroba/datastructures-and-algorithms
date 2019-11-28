class Node:
    def __init__(self,key):
        self.left=None
        self.right=None
        self.val=key

#Funtion that do inorder tree traversal
count = 0
def printInorder(root):
    print(root)
    if root:
        # print(root.val)
        #print recur on left child
        printInorder(root.left)
        # then print the data on the node
        print("recur " ,root.val)
        #print recur on righ child
        printInorder(root.right)
        #print(root.val)


# driver code
root=Node(1)
root.left=Node(2)
root.left.right=Node(5)
root.left.left=Node(4)
root.right=Node(3)

printInorder(root)
