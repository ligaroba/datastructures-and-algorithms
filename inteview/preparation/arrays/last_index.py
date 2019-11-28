
def lastindex(s):
    last=-1
    for i,vl in enumerate(s):

        if vl=='1':
            last=i
    return last


s="0001"
print(lastindex(s))
