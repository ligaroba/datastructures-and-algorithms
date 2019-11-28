class BST:
    def __init__(self,data=None):
        self.left=None
        self.right=None
        self.data=data

    def insert(self,data):
        if self.data is not None:
            if data <self.data:
               if self.left is None:
                   self.left=BST(data)

               else :
                   self.left.insert(data)


            if self.data>data:
                if self.right is None:
                    self.right=BST(data)

                else:
                    self.right.insert(data)

        else :
            self.data=data


    def printTree(self):
        if self.left:
           self.left.printTree()
           print(self.data)
        if self.right:
            self.right.printTree()

    def travasal(self,lkpval):
        if lkpval<self.data:
            if self.left is None:
                return str(lkpval) + " Not found"
            return self.left.travasal(lkpval)
        elif lkpval>self.data:
            if self.right is None:
                return str(lkpval) + " Not found"
            return self.left.travasal(lkpval)
        else :
            print(str(self.data) + ' is found')



root =BST(12)
root.insert(11)
root.insert(10)
root.insert(24)

print(root.travasal(10))
print(root.travasal(7))

#print(root.printTree())







