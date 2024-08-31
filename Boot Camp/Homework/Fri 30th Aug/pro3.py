"""

Problem Statement 

 An automobile company manufactures both a two wheeler (TW) and a
four wheeler (FW). A company manager wants to make the production of both types of
vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
per the given data.
Example :

Input :
200 -> Value of V
540 ->; Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

"""

vehicles = int(input("Enter the number of vehicles : "))
wheels = int(input("Enter the number of wheels : "))

four_wheeler = (wheels - 2*vehicles)/2
two_wheeler = vehicles - four_wheeler

print(f" Number of four wheeler is {four_wheeler} and Number of Two wheeler is {two_wheeler}")