"""
Construct the following pyrami of numbers

         1
        232
       34543
      4567654
     567898765
    67890109876
   7890123210987
  890123454321098
 90123456765432109
0123456789876543210

"""
n = int(input("Enter the Number : "))

for i in range(1, n + 1):
        print(" " * (n - i), end="")
        for j in range(i, i + i):
            print(j % 10, end="")
        for j in range(i + i - 2, i - 1, -1):
            print(j % 10, end="")
        print()