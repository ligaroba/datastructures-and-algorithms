'''
Given a singly linked list of N nodes. The task is to find middle of the linked list.
For example, if given linked list is 1->2->3->4->5 then output should be 3.

If there are even nodes, then there would be two middle nodes, we need to print second middle element. For example, if given linked list is 1->2->3->4->5->6 then output should be 4.

Input:
First line of input contains number of testcases T. For each testcase,
 first line of input contains length of linked list and next line contains data of nodes of linked list.


'''


class Node:
    def __init__(self,data):
        self.next=None
        self.data=data

class LinkedList:
    def __init__(self):
        self.head=None

    #inserting node at the begining
    def insert_begining(self,data):
        nextNode=Node(data)
        nextNode.next=self.head
        self.head=nextNode

    # inserting node at the end
    def insert_end(self,data):
        nextNode=Node(data)
        if not self.head:
            self.head = nextNode
        else :
            current=self.head

            while current.next:
                current=current.next
            current.next=nextNode

    # getting the middle of the of the linked list
    def get_middle(self):
        slow=self.head
        fast=self.head.next
        mid=0
        while fast.next:
           mid=slow.data
           slow=slow.next
           fast=fast.next
        return mid
    # reversing a linkedList

    def reverseList(self):
        current=self.head
        prev=None
        while current:
            if current.next:
                nextNode = current.next
                current.next=prev
                prev = current
                current=nextNode
            else:
                nextNode.next=prev
                self.head=nextNode
                break

    # Rotating a List
    def rotate_list(self,k):
        current=self.head
        curr_head=self.head
        curr_tail=None
        new_head=None
        new_tail=None
        counter=0
        j=(k+1)
        while current:
            if current.next:
                if counter<j:
                    curr_tail=current
                    new_head=current.next
                counter += 1
                new_tail = current
                print(curr_head.data, curr_tail.data, new_head.data, new_tail.data)
            else :
               break
        print(curr_head.data,curr_tail.data,new_head.data,new_tail.data)
        curr_tail.next=None
        new_tail.next=curr_head
        self.head=new_head

    #Reversing a List using based on custom counter
    def reverseListCust(self,headNode,size):
        current=headNode
        print("Head " , headNode.data)
        prev=None
        counter=0
        nextNodeGroup=None
        tail_node=None
        while current:
                if current.next and counter<(size-1):
                    nextNode = current.next
                    current.next = prev
                    if counter==0:
                        tail_node=current
                    prev = current
                    current=nextNode
                else:
                    nextNodeGroup=nextNode.next
                    nextNode.next=prev
                    headNode=nextNode
                    break
                counter+=1
        print("New test " , headNode.data, tail_node.data, nextNodeGroup.data)
        return headNode,tail_node,nextNodeGroup

    #Reverse a Linked List in groups of given size - driver method for reverseListCust()
    def reversingLinkeListGroups(self,gsize):
        current,current_tail,nextnodegroup=self.reverseListCust(self.head,gsize)
        self.head=current
        while nextnodegroup.next:
                new_head,new_tail,nextnodegroup=self.reverseListCust(nextnodegroup.next, gsize)
                current_tail.next=new_head
                current_tail=new_tail
        print(self.head.data,nextnodegroup.data, current_tail.data, current.data, current_tail.data)

    def intersectionPoint(self):

        print("test")

    def duplicate(self):
        copy = LinkedList()
        current=self.head
        while current:
            node = Node(current.data)
            copy.insert_end(node)
            current = current.next
        return copy

    def display(self):
        current = self.head
        while current:
            print(current.data, end=' ')
            current = current.next




    def printList(self):
        temp=self.head
        res=''
        while temp:
            res+=str(temp.data)+" --> "
            temp=temp.next
        res+="None"
        print(res)





def remove_duplicates(llist):
    current1 = llist.head
    while current1:
        current2 = current1.next
        data = current1.data
        while current2:
            temp = current2
            current2 = current2.next
            if temp.data == data:
                llist.remove(temp)
        current1 = current1.next


def find_intersection(llist1, llist2):
    if (llist1.head is None or llist2.head is None):
        return LinkedList()

    intersection = LinkedList()
    current1 = llist1.head
    while current1:
        current2 = llist2.head
        data = current1.data
        while current2:
            if current2.data == data:
                node = Node(data)
                intersection.insert_end(node)
                break
            current2 = current2.next
        current1 = current1.next
    remove_duplicates(intersection)

    return intersection


def find_union(llist1, llist2):
    if llist1.head is None:
        union = llist2.duplicate()
        remove_duplicates(union)
        return union
    if llist2.head is None:
        union = llist1.duplicate()
        remove_duplicates(union)
        return union

    union = llist1.duplicate()
    last_node = union.head
    while last_node.next is not None:
        last_node = last_node.next
    llist2_copy = llist2.duplicate()
    last_node.next = llist2_copy.head
    remove_duplicates(union)

    return union


list=LinkedList()
list.insert_begining(1)
list.insert_begining(5)
list.insert_begining(7)
list.insert_begining(6)
list.insert_begining(4)
list.insert_begining(2)

list2=LinkedList()
list2.insert_end(7)
list2.insert_end(6)
list2.insert_end(4)
list2.insert_end(2)




union = find_union(list2, list)
union.printList()

intersection = find_intersection(list2, list)

print('Their union: ')
union.display()
print()
print('Their intersection: ')
intersection.display()
print()











'''

print("Middle \n ", list.get_middle())
#list.reverseList()



print("After Reverse \n")
#list.printList()

print("\n Rotated \n")
k=2
#list.rotate_list(k)
#list.printList()

print(" ")


gsize=2
print("reverse group \n ")
list.reversingLinkeListGroups(gsize)
list.printList()

'''