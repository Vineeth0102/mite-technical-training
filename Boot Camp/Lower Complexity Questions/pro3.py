"""Solve the quadratic equation ax^2 + bx + c = 0 for x (using the formula )"""

import math

a,b,c = map(int,input("Enter the Quadratic Equation's a,b,c values i.e (ax^2 + bx + c = 0) ").split())

if a == 0:
    print("The given equation is not Quadratic ")
else :
    disc = b **2 - 4 * a * c
    sqrt_val = math.sqrt(abs(disc))

    if disc > 0:
        print("Roots are real and different ")
        print((-b + sqrt_val)/(2 * a))
        print((-b - sqrt_val)/(2 * a))
    elif disc == 0:
        print("Roots are real and same")
        print(-b / (2*a))
    else: 
        print("Roots are complex")
        print(- b / (2*a), " + i", sqrt_val / (2 * a))
        print(- b / (2*a), " - i", sqrt_val / (2 * a))