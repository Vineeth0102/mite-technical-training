"""
Fibonaccisequence
 a. Printing n Fibonacci numbers
 b. Printing nth Fibonacci number
 c. Given a number, printing next Fibonacci number
 """

num = int(input("Enter the n value for fibonaci squence : "))

num1,num2 = 0,1

if num == 1:
    print(num1)
elif num == 2 :
    print(num1,num2)
elif num <1:
    print("Invalid Input")
else :
    print(num1,num2,end=" ")
    for i in range(3,num+1):
        num2,num1 = num1+num2,num2
        print(num2,end=" ")