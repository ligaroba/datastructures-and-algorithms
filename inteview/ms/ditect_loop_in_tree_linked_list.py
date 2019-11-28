'''

Detect loop in a linked list
Given a linked list, check if the the linked list has loop or not. Below diagram shows a linked list with a loop.


Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.
Following are different ways of doing this
Use Hashing:
Traverse the list one by one and keep putting the node addresses in a Hash Table. At any point,
if NULL is reached then return false and if next of current node points to any of the previously stored nodes in Hash then return true.


'''

class Node:
    def __init__(self,data):
        #Construtor to initialize
        # Node object
        self.data=data
        self.next=None

class LinkedList:
    #Function to initialize the head
    def __init__(self):
        self.head = None
    #Function to insert new node at the beginning
    def push(self,new_data):
        new_node=Node(new_data)
        new_node.next=self.head
        self.head=new_node
    #Utility Function to print the linked list

    def printlist(self):
        temp=self.head
        while temp:
            print(temp.data, end=" ")
            temp=temp.next
    #
    def detectLoop(self):
        s=set()
        temp=self.head
        while temp:
            #if we have the node in the hashmap
            # return True (cause your encountering node for the second time)
            if temp in s:
                return True
            s.add(temp)
            temp=temp.next
            return False

    def detectLoopFloyd(self):
        slow=self.head
        fast=self.head
        while (slow and fast and fast.next):
            fast_p=fast.next.next
            slow_p=slow.next
            if slow_p==fast_p:
                return True
            else:
                return False
#Driver program for the list


# Driver program for testing
llist = LinkedList()
llist.push(20)
llist.push(4)
llist.push(15)
llist.push(10)

# Create a loop for testing
llist.head.next = llist.head
llist.detectLoopFloyd()

if(llist.detectLoopFloyd()):
    print("Loop detected")
else :
    print("No loop")

