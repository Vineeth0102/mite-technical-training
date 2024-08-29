"""
Prime Numbers - 
 a. Printing n Prime numbers
 b. Printing nth Prime number
 c. Given a number , printing next Prime number
"""
import math

num = int(input("Enter the Number : "))
counter,val = 0, 2
if num >0:
    print(2,end=" ")
while(counter < num-1):
    flag = 0
    for i in range(2,(math.ceil(val**0.5))+1): #
        if val % i == 0 : 
            flag = 1
            break
    if flag == 0:
        print(val,end = " ")
        counter +=1
    val +=1 


    