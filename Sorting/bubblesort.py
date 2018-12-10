def bubble_sort(data):
    bubble_data = data[:]
    for i in range(0,len(bubble_data)):
        for j in range(i+1,len(bubble_data)):
            if bubble_data[i]>bubble_data[j]:
                bubble_data[i],bubble_data[j]=bubble_data[j],bubble_data[i]
    return bubble_data



def recus_bubble_sort(data,n=0,m=1):
    bubble_data = data[:]
    print("called", m, n, bubble_data[m], bubble_data[n])
    if bubble_data[m] < bubble_data[n]:
        bubble_data[n], bubble_data[m] = bubble_data[m], bubble_data[n]
        recus_bubble_sort(bubble_data,n+1,m+1)
    else :
        recus_bubble_sort(bubble_data, n + 1, m + 1)
    return bubble_data


data=[54,26,93,17,77,31,44,55,20]
print(recus_bubble_sort(data))