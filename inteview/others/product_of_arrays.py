'''

You have a list of integers, and for each index you want to find the product of every integer except the integer at that index.

Write a function get_products_of_all_ints_except_at_index() that takes a list of integers and returns a list of the products.

For example, given:

  [1, 7, 3, 4]

your function would return:

  [84, 12, 28, 21]

by calculating:

  [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
'''
def prodArrSum(arr):
    product=1
    res = []
    for i in range(0,len(arr)):
        product *= arr[i]


    for i in range(0, len(arr)):
        res.append(int(product/arr[i]))
    return res


def prodOfArrays(arr):
    res=[]
    for i in range(0,len(arr)):
        product = 1
        for j in range(0,len(arr)):
            if j!=i:
                product*=arr[j]

        res.append(product)
    return res
arr=[1, 7, 3, 4]
arr2=[1,2,3,4]
print(prodArrSum(arr2))