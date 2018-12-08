class Node(object):
    def __init__(self,data):
        self.data=data
        self.nextNode=None

    def removeNode(self,data,previousNode):
        if self.data==data:
           previousNode.nextNode = self.nextNode
           del self.data ## Gabbage collection
           del self.nextNode
        else :
            if self.nextNode is not None:
                self.nextNode.remove(data,self)

