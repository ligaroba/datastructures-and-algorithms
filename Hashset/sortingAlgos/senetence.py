

def sentence_count(s):
    sarray=[]
    for word in s:
        if word !=' ':
            sarray.append(word)
    return len(sarray)

s="Hi roebrt"

print(sentence_count(s))



sentence = 'This is a sentence'
sentence.count()

def sentence_count(s):
    sarray = []
    tmp = ''
    for c in sentence:
        if c == ' ':
            sarray.append(tmp)
            tmp = ''
        else:
            tmp += c
    if tmp:
        sarray.append(tmp)


    print(len(sarray))
sentence_count(sentence)



0 0 0 0 0 0 0 0 0 0 0 0 0

0 0 0 0 0 1 1 1 0 1 1 0 0

0 0 0 0 0 1 1 0 0 1 1 0 0

0 1 1 0 0 0 0 0 0 0 0 0 0

0 1 1 1 0 0 0 0 0 0 0 0 0

0 1 1 1 0 0 1 0 0 0 0 0 0

0 1 1 0 0 0 0 0 0 1 1 0 0

0 1 0 0 0 0 0 0 1 1 1 0 0

0 0 0 0 0 0 0 0 0 0 0 0 0