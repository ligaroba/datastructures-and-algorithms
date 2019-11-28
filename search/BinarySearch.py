"""
 if you want to search
 Complexities of algorthims

 constant time comlexities algoritm O(1): used when you want swap two numbers
 Logarithmic time comlexities or binary search (O(logN)) : used to search for something in a sorted array
 Linear time comlexities O(N)  : find max element in as unsorted array you have to iterate in all the items one by one
 lineararithmic  time comlexities O(N*logN) most of divide and conquere algorithim:
 linearithimic time complexities O(N*logN) : eg Heapsort,Quicksort,Mergesort
 Quadratic O(N^2) time complexities: Bubble sort,
 Exponetial O(2^N) time complexities : travel salesman problem with dynamic programming
 Factorial O(N!) : Travelling saleman with brute force search

 P - polinomial (is a class of ci=omputational problmns that can be solved efficiently ) :
 sort array,search, finsd the shortest route all problems are in polynomial

 NP complete : p==NP  chinese postman problem, graph coloring
 NP-hard:
 NP : Non - deterministic polynomial  eg factorization , travel salesman

"""
pos=-1
def binary_search(data,num):
    #key : the number to search
    n=len(data)
    lower=0
    upper=n-1
    while lower<=upper:
            mid=(lower+upper)//2
            if num==data[mid]:
                globals()['pos']=mid
                return True
            elif num<data[mid]:
                upper=mid-1
            else:
                lower=mid+1
    return False

data=[17, 20, 26, 31, 44, 54, 55, 77, 93]

if binary_search(data,93):
    print(str(data[pos]) +" found at position "+ str(pos+1) + " of " + str(data))
else:
    print("Number not found " )


