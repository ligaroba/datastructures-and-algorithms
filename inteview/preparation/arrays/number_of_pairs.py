'''

Find number of pairs (x, y) in an array such that x^y > y^x

Given two arrays X[] and Y[] of positive integers, find number of pairs such that x^y > y^x where x is an element from X[] and y is an element from Y[].

Examples:

    Input: X[] = {2, 1, 6}, Y = {1, 5}
    Output: 3
    Explanation: There are total 3 pairs where pow(x, y) is greater
    than pow(y, x) Pairs are (2, 1), (2, 5) and (6, 1)

    Input: X[] = {10, 19, 18}, Y[] = {11, 15, 9}
    Output: 2
    Explanation: There are total 2 pairs where pow(x, y) is greater
    than pow(y, x) Pairs are (10, 11) and (10, 15)

'''


def countPairsBruteForce(arrX,arrY):
    sizeX=len(arrX)
    sizeY=len(arrY)
    ans=0
    for i in range(0,sizeX):
        for j in range(0,sizeY):
            if pow(arrX[i],arrY[j])>pow(arrY[j],arrX[i]):
                ans+=1
    return ans

arrX = [2, 1, 6]
arrY = [1, 5]

print(countPairsBruteForce(arrX,arrY))
