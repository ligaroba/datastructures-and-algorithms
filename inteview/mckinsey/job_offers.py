def job_offers(scores, lowerLimits, upperLimits):
    answer = []
    print(list(enumerate(lowerLimits)))
    for index, item in enumerate(lowerLimits):
        print(index,item)
        table  = []
        for score in scores:
            if score >= lowerLimits[index] and score <= upperLimits[index]:
                table.append(score)
        if table:
            answer.append(len(table))
            print(answer)
        else:
            answer.append(0)
        print(table)
    return answer


scores = [1,3,5,6,8]
lowerLimits = [2]
upperLimits = [6]

print(job_offers(scores,lowerLimits,upperLimits))