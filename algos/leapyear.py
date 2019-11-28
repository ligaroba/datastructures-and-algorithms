"""
month of the year, February.
In the Gregorian calendar three criteria must be taken into account to identify leap years:

The year can be evenly divided by 4, is a leap year, unless:
The year can be evenly divided by 100, it is NOT a leap year, unless:
The year is also evenly divisible by 400. Then it is a leap year.
This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, while 1800, 1900, 2100, 2200, 2300 and 2500

"""
"""
9
BANANA FRIES 12
POTATO CHIPS 30
APPLE JUICE 10
CANDY 5
APPLE JUICE 10
CANDY 5
CANDY 5
CANDY 5
POTATO CHIPS 30

"""
string ="BANANA FRIES 12"
print(string.rpartition(' '))

from collections import OrderedDict
d = OrderedDict()
for _ in range(int(input())):
    item, space, quantity = input().rpartition(' ')
    d[item] = d.get(item, 0) + int(quantity)
for item, quantity in d.items():
    print(item, quantity)


def is_leap(year):
    leap = False

    # Write your logic here
    if year >= 1900 and year <= 10 ** 5:
        if year % 100 == 0:
            if (year % 4 == 0) and (year % 400 == 0):
                leap = True
        elif (year % 4 == 0):
            leap = True

    return leap


year = int(input())
print(is_leap(year))