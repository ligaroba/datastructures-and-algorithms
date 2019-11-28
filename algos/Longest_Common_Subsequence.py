

def LCM(seqa,seqb):
    seqDict={}
    setSeq=set()
    #o(n)
    for i in seqa:
        if i not in seqDict:
            #print(i)
            seqDict.update({str(i)+str(1)})

    for y in seqb:
        if y in seqDict:
            setSeq.add(y)

    return setSeq


print(LCM("AGGTAB","GXTXAYB"))
print(" LCM " + str(len(LCM("AGGTAB","GXTXAYB"))))