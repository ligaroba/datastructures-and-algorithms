




class Node:
    def __init__(self,key):
        self.key=key
        self.left=None
        self.right=None


class Tree:

    def heght(self,root):
        if root is None:
            return 0
        else:
           lheight=self.heght(root.left)
           rheight=self.heght(root.right)
           return max(lheight,rheight)+1

    #Spiral print of a tree in O(n) and o(n) space complexity
    def spiralQueue(self,root):
        if (root == None):
            return  # None check

            # Create two stacks to store
            # alternate levels
        s1 = []  # For levels to be printed
        # from right to left
        s2 = []  # For levels to be printed
        # from left to right

        # append first level to first stack 's1'
        s1.append(root)

        # Keep printing while any of the
        # stacks has some nodes
        while not len(s1) == 0 or not len(s2) == 0:

            # Print nodes of current level from s1
            # and append nodes of next level to s2

            while not len(s1) == 0:
                temp = s1[-1]

                s1.pop()
                print(temp.key, end=" ")

                # Note that is right is appended
                # before left
                if (temp.right):
                    s2.append(temp.right)
                if (temp.left):
                    s2.append(temp.left)

            # Print nodes of current level from s2
            # and append nodes of next level to s1

            while (not len(s2) == 0):
                temp = s2[-1]

                s2.pop()
                print(temp.key, end=" ")

                # Note that is left is appended
                # before right
                if (temp.left):
                    s1.append(temp.left)
                if (temp.right):
                    s1.append(temp.right)


    #Spiral traversal of a tree in o(n^2)
    def traversalnSpiral(self,root,hd):
        h=self.heght(root)
        ltr=False
        for i in range(0,h):
            self.printGivenLevel(root,i,ltr)
            ltr =not ltr

    def printGivenLevel(self,root,level,ltr):

        if root is None:
            return 0
        elif level==0:
           print(root.key,end=" ")
        elif level>0:
            if ltr:
                self.printGivenLevel(root.left,level-1,ltr)
                self.printGivenLevel(root.right, level - 1, ltr)
               
            else:
                self.printGivenLevel(root.right, level - 1, ltr)
                self.printGivenLevel(root.left, level - 1, ltr)

    def leftView(self,root,res):
        flag=True
        if root is None:
            print(res)
            return
        else:
            res += str(root.key)+" "
            self.leftView(root.left,res)


    # Bootom View using Queue
    def bottomViewQueue(self,root):
        if root is None:
            return 0
        q=[]
        mp=dict()
        hd=0
        q.append(root)

        while len(q)>0:
            tmp=q.pop(0)
            #print("curent value in queue ", tmp.key)
            try:
                mp[hd].append(tmp.key)
            except:
                mp[hd]=[tmp.key]

            if tmp.left is not None:
                hd-=-1
                q.append(tmp.left)

            if tmp.right is not None:
                hd+=1
                q.append(tmp.right)
        n=len(mp)
        for idx, value in enumerate(sorted(mp)):
            #print(idx,mp[value],value)
            if idx == (n-1):
                print(mp[value])




    # printing bottom view using vertical order traversal
    def bottomViewUsingVerticalOrder(self,root,hd,m):
        if root is None :
            return 0
        try :
            m[hd].append(root.key)
        except:
            m[hd]=[root.key]

        self.bottomViewUsingVerticalOrder(root.left,hd-1,m)
        self.bottomViewUsingVerticalOrder(root.right,hd+1,m)

    def printBottomView(self,root):
        m=dict()
        hd=0
        res=''
        self.bottomViewUsingVerticalOrder(root,hd,m)

        for idx,value in enumerate(sorted(m)):
            n=len(m[value])
            if n>0:
                res+=str(m[value][n-1])
            else:
                res += str(m[value][0])
        print(res)

    # vertical order traversal
    def vertical_traversal(self,root,hd,m):

        if root is None:
            return 0
        try :
            m[hd].append(root.key)
        except:
            m[hd]=[root.key]

        #Store Nodes on the left subtree
        self.vertical_traversal(root.left,hd-1,m)
        #Stere nodes on the right subtree
        self.vertical_traversal(root.right, hd + 1, m)

    def printVerticalOrder(self,root):
        print("test")
        m=dict()
        hd=0
        self.vertical_traversal(root,hd,m)
        print(hd)
        for idx,value in enumerate(sorted(m)):
            print(idx,m[value])
            print()

root =Node(20)
root.left = Node(8)
root.right =Node(22)
root.left.left = Node(5)
root.left.right = Node(3)
root.right.left = Node(4)
root.right.right =Node(25)
root.left.right.left =  Node(10)
root.left.right.right = Node(14)

tree = Tree()
#tree.printVerticalOrder(root)

#tree.printBottomView(root)

#tree.bottomViewQueue(root)

#tree.leftView(root,'')
tree.traversalnSpiral(root,0)
print(" Spiral using queue \n")
tree.spiralQueue(root)
