




import numpy as np

##Simple method
def LCMLength(strX,crXidx,lenX,strY,crYidx,lenY):

    if lenX==crXidx or lenY==crYidx:
        return 0
    elif strX[crYidx]==strY[crYidx]:
        return 1+LCMLength(strX,lenX+1,lenX,strY,crYidx+1,lenY)
    else:
        return max(LCMLength(strX,lenX+1,lenX,strY,crYidx,lenY),LCMLength(strX,lenX,lenX,strY,crYidx+1,lenY))

def LCSLength(strX,crXidx,lenX,strY,crYidx,lenY):
    LCS=[[ 0 for i in range(lenY)]  for i in range(lenX)]

    for i in range (lenY-1):
        LCS[i][lenY-1]=0

    for j in range(lenX-1):
        LCS[lenX - 1][j] = 0



    for i in range(lenX-1,-1):
        for j in range(lenY-1,-1):
            LCS[i][j]=LCS[i+1][j+1]
            if strX[i]==strY[j]:
                LCS[i][j]+=1
            else:
                max(LCS[i][j+1],LCS[i+1][j])


    print(np.array(LCS))

strX="ABCBDAB"
crXidx=0
lenX=len(strX)
strY="BDCABA"
crYidx=0
lenY=len(strY)
print(LCSLength(strX,crXidx,lenX,strY,crYidx,lenY))