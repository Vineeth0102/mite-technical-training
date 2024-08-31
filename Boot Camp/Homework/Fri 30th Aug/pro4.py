"""
4) A party has been organised on cruise. The party is organised for a limited time(T). The
number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as
elements of the array. The task is to find the maximum number of guests present on the cruise
at any given instance within T hours.

Example 1:
Input :

5 -> Value of T
[7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by new
line
[1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new
line.
Output :
8 -> Maximum number of guests on cruise at an instance.

"""

time = int(input("Enter the Time : "))
Enter_arr = list(map(int,input("Enter the number of people entering in every instance : ").split()))
Leave_arr = list(map(int,input("Enter the number of people leaving in every instance : ").split()))
res,rem = 0,0
for i in range(len(Enter_arr)):
    rem += Enter_arr[i] - Leave_arr[i]
    res = max(res,rem)
print(res)