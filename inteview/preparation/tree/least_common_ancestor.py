'''

Least Commen ancestor
'''


class Node:
    def __init__(self,data):
        self.right=None
        self.left=None
        self.data=data

class Tree:

    def __init__(self):
        self.head=None

    def height(self,root):
        if root is None :
            return 0
        return max(self.height(root.left),self.height(root.right))+1

    seri = list()
    def serializeBT(self,root):

        if root is None :
            self.seri.append(-1)
            return
        self.seri.append(root.data)
        print(self.seri)
        self.serializeBT(root.left)
        self.serializeBT(root.right)


    def checkHeightBalance(self,root):
        if root is None :
            return 0
        lheight=self.checkHeightBalance(root.left)
        if lheight==-1:
                return -1

        rheight = self.checkHeightBalance(root.right)
        if rheight == -1:
            return -1
        if abs(lheight-rheight)>1:
            return -1
        return (max(lheight,rheight)+1)

    def printLeafnodes(self,root):
        leaf= []
        count=0
        h=self.height(root)
        if root is None and h<0:
            return False

        if root.left is None or root.right is None and h>0:
            leaf.append(root.data)
            count+=1
            print(leaf,count)
            return 0
        else:
            self.printLeafnodes(root.left)
            self.printLeafnodes(root.right)




    def checkmirrorBT(self,root1,root2):
        if root1 is None and root2 is  None :
            return True
        if root1 is None and root2 is not None :
            return False

        if root1.data ==root2.data:
            self.checkmirrorBT(root1.left,root2.right)
            return True
        else:
            return False



    def checkBinaryTreeSame(self,root1,root2):
        if root1 is None and root2 is None:
            return 1
        if root1.data ==root2.data and self.check(root1.left,root2.left)\
            and self.check(root1.right,root2.right):
            return 1
        else:
            return 0


    def treeToDoubleList(self,root):
        if root is None :
            return
        prev=None
        self.treeToDoubleList(root.left)

        if prev==None:
            self.head=root.data

        else:
            root.left=prev
            prev.right=root.data
        prev=root
        self.treeToDoubleList(root.right)




    def diameter(self,root):
        if root is None :
            return 0

        lheight=self.height(root.left)
        rheight=self.height(root.right)
        ldiameter=self.diameter(root.left)
        rdiameter = self.diameter(root.right)
        print(lheight,rheight,rdiameter,ldiameter)
        return max((lheight+rheight+1),max(ldiameter,rdiameter))




    #inorder traversal
    def LCA(self,root,val1,val2):
        if root is None:
            return None
        if root.data == val1 or root.data==val2:
            return root
        left=self.LCA(root.left,val1,val2)
        right = self.LCA(root.right, val1, val2)

        if left!=None and right!=None:
            return root
        else:
            if left==None and right!=None:
                return right
            else:
                return left
'''
                      20
                    /    \
                  8       22
                /   \     / \
              5      3  4     25
                    / \
                 10     14
'''

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
#print(tree.LCA(root,4,25).data)
#print(tree.diameter(root))
#print(tree.printLeafnodes(root))
#print(tree.checkHeightBalance(root))
tree.serializeBT(root)

root1 =Node(20)
root1.left = Node(8)
root1.right =Node(22)
root1.left.left = Node(5)
root1.left.right = Node(3)
root1.right.left = Node(4)
root1.right.right =Node(25)
root1.left.right.left =  Node(10)
root1.left.right.right = Node(14)

#print(tree.checkmirrorBT(root,root1))
