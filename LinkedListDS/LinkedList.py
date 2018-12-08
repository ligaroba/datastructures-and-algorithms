from LinkedListDS.Node import Node

class LinkedList(object):
 def __init__(self):
     self.head=None
     self.counter=0

 def traverse(self):
     actualNode=self.head
     while actualNode is not None:
         print("%d" % actualNode.data)
         actualNode=actualNode.nextNode

  #O(1)
 def insertStart(self,data):
     self.counter+=1
     nextNode=Node(data)
     if not self.head:
         self.head=nextNode
     else :
         nextNode.nextNode=self.head
         self.head=nextNode

 #O(1) instead of O(N)
 def size(self):
     return self.counter
 #O(N)
 def insertEnd(self,data):
     nextNode=Node(data)
     actualNode=self.head

     while actualNode.nextNode is not None:
         actualNode=actualNode.nextNode
     actualNode = actualNode.nextNode
 #O(N)
 def remove(self,data):
     if self.head:
         if data==self.head.nextNode:
             self.head=self.head.nextNode
         else :
             self.head.remove(data,self,self.head)


