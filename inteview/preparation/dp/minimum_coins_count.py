
"""
Given a value N, total sum you have. You have to make change for Rs. N, and there is infinite supply of each of the denominations in Indian currency, i.e., you have infinite supply of { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000} valued coins/notes, Find the minimum number of coins and/or notes needed to make the change for Rs N.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of an Integer value N denoting the amount to get change for.

Output:
Print all the denominations needed to make the change in a separate line.
"""


import sys

def MCC(arr_dem,n,inres):
    res=inres
    balance=n%10
    val=n-balance
    m=sys.maxsize
    denom=0

    if balance>0:
        print(balance,val)
        if int(balance%5)==0:
            res.append((str(5)) * int((balance / 5)) if int((balance % 5))==0 else 0)
        elif int((balance%5)%2)==0:
            res.append((str(2)) * int((balance % 5) / 2) if int((balance % 5))==0 else 0)
            res.append((str(5)) * int((balance / 5)) if int((balance % 5))==0 else 0)
        else:
            res.append(str(1))
            res.append((str(2)) * int((balance % 5) / 2) if int((balance % 5))==0 else 0)
            res.append((str(5)) * int((balance / 5)) if int((balance % 5))==0 else 0)


    if val==1:
        res.append(str(10)*val)
    else:
        for i in range(len(arr_dem)):
            n_denm=int(val/arr_dem[i])
            if m>n_denm:
                if n_denm>0:
                    denom = arr_dem[i]
                    m=n_denm
    res.append((str(denom)+' ') * m)
    #Handling Overflow division of 10
    rem=(val%denom)
    if rem>0:
        MCC(arr_dem, rem,res)

    return res

arr_dem=[1,2,5,10,20,50,100,200,500,1000,2000]
n=561
res=[]
print(MCC(arr_dem,n,res))