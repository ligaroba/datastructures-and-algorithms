''''
Given arrival and departure times of all trains that reach a railway station.
Your task is to find the minimum number of platforms required for the railway station so that no train waits.

Note: Consider that all the trains arrive on the same day and leave on the same day.
Also, arrival and departure times will not be same for a train, but we can have arrival time of one train equal to departure of the other.

In such cases, we need different platforms, i.e at any given instance of
time, same platform can not be used for both departure of a train and arrival of another.

Input:
The first line of input contains T, the number of test cases.
For each test case, first line will contain an integer N, the number of trains. Next two lines will consist of N space separated time intervals denoting arrival and departure times respectively.
Note: Time intervals are in the 24-hour format(hhmm),
of the for HHMM , where the first two charcters represent hour (between 00 to 23 ) and last two characters represent minutes (between 00 to 59).
Input:

0900  0940 0950  1100 1500 1800
0910 1200 1120 1130 1900 2000

0900 1100 1235
1000 1200 1240

Output:
3
1

Explanation:
Testcase 1: Minimum 3 platforms are required to safely arrive and depart all trains.
'''


'''
The corner cases are:
* When departure time is less than arrival time, add 2400 to it
* When a train departs at the same time as it arrives, we need a new platform
* When a train departs at the same time as another train arrives, we dont need a platform.The corner cases are:



'''


# Program to find minimum
# number of platforms
# required on a railway
# station

# Returns minimum number
# of platforms reqquired
def findPlatform(arr, dep, n):
    # Sort arrival and
    # departure arrays
    arr.sort()
    dep.sort()

    # plat_needed indicates
    # number of platforms
    # needed at a time
    plat_needed = 1
    result = 1
    i = 1
    j = 0

    # Similar to merge in
    # merge sort to process
    # all events in sorted order
    while (i < n and j < n):

        # If next event in sorted
        # order is arrival,
        # increment count of
        # platforms needed
        if (arr[i] < dep[j]):

            plat_needed += 1
            i += 1

            # Update result if needed
            if (plat_needed > result):
                result = plat_needed


                # Else decrement count
        # of platforms needed
        else:

            plat_needed -= 1
            j += 1

    return result


# driver code

arr = [900, 940, 950, 1100, 1500, 1800]
dep = [910, 1200, 1120, 1130, 1900, 2000]
n = len(arr)

print("Minimum Number of Platforms Required = ",
      findPlatform(arr, dep, n))

# This code is contributed
# by Anant Agarwal.

