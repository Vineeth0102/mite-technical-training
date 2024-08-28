"""How much do you pay an auto rickshaw guy? There is a fixed minimum charge of Rs. 35 which
takes you the first 1.5 km. After that every km is Rs.25. If you travel x km, what is the amount you
have to pay?"""

import math 

distance_travelled = float(input("Enter the distance travelled in km : "))
if distance_travelled == 0 :
    cost = 0
elif distance_travelled <0 :
    print("Distance can't be Negative")
    exit(0)
elif distance_travelled <=1.5:
    cost = 35
else :
    cost = math.ceil(distance_travelled - 1.5)*25 + 35
print(f"Total Auto Fare is : {cost}")