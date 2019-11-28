from numpy import *

class Graph:
    def __init__(self,m_data):
        self.m_data=m_data#reshape(m_data,(self.shape_x, self.shape_y))
        self.visited=[]
        self.counter=0

    def land(self):
         for x in range(0,m_data.shape[0]):
            for y in range(0,m_data.shape[1]):
                visited_element=m_data[x][y]
                if visited_element==1 \
                        and m_data[x - 1, y] != 1 \
                        and m_data[x + 1, y-1] != 1 \
                        and m_data[x, y - 1]!= 1\
                        and (x,y) not in self.visited:
                          self.counter += 1
                          self.visited.append((x, y))
                          #print((x,y),m_data[x,y],self.counter)
                else :
                        self.visited.append((x, y))
                        #print(next_element)

         print(self.counter)

    def run_app(self):
        self.land()



m_data= array([
           [0, 0 ,0 ,0, 0, 0 ,0, 0, 0 ,0 ,0, 0, 0],
           [0, 0 ,0 ,0, 0, 0, 1, 1, 0 ,1 ,1, 0, 0],
           [0 ,0 ,0 ,0, 0 ,1, 1, 0, 0 ,1 ,1, 0, 0],
           [0, 1 ,1 ,0 ,0, 0 ,0 ,0 ,0, 0, 0, 0, 0],
           [0, 1 ,1, 1, 0, 0 ,0 ,0 ,0 ,0 ,0, 0, 0],
           [0 ,1, 1, 1 ,0 ,0 ,1, 0, 0 ,0 ,0, 0, 0],
           [0, 1 ,1, 0, 0 ,0, 0, 0 ,0 ,1, 1, 0, 0],
           [0, 1, 0, 0, 0 ,0 ,0 ,0, 1, 1, 1, 0 ,0],
           [0, 0, 0, 0 ,0 ,0, 0 ,0 ,0, 0, 0, 0, 0]
          ])
g=Graph(m_data)
g.run_app()






#print(m_data.reshape(9,13)[3,1],m_data.reshape(9,13)[2,1],m_data.reshape(9,13)[3,0])





