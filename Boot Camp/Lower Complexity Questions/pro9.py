"""
Construct the following pyrami of numbers

0123456789876543210
 90123456765432109
  890123454321098
   7890123210987
    67890109876
     567898765
      4567654
       34543
        232
         1


"""
n = int(input("Enter the Number : "))

for i in range(n, 0, -1):
        print(" " * (n - i), end="")
        for j in range(i, i + i):
            print(j % 10, end="")
        for j in range(i + i - 2, i - 1, -1):
            print(j % 10, end="")
        print()