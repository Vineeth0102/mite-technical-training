"""Finding some of digits of a number
 i. Extend the above to take scientific numbers e.g 2.23457932e4
 """

val = input("Enter the Number : ").split("e")
res = 0
for i in val[0]:
    if i.isdigit():
        res+=int(i)
print(res)