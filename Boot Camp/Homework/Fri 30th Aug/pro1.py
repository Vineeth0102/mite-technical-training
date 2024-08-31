""" Explain most complex program you have done or Explain your mini project."""

"""
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

"""

histogram = list(map(int,input("Enter the heights of the building : ").split()))

size = len(histogram)
NSR_index,NSL_index = [0]*size , [0]*size
stack = []
for i in range(size):
    while stack and histogram[stack[-1]] >= histogram[i]:
        stack.pop()
    if stack :
        NSL_index[i] = stack[-1]
    else :
        NSL_index[i] = -1
    stack.append(i)

stack = []
for i in range(size-1,-1,-1):
    while stack and histogram[stack[-1]] >= histogram[i]:
        stack.pop()
    if stack :
        NSR_index[i] = stack[-1]
    else :
        NSR_index[i] = size
    stack.append(i)
    
area,res = 0,0
for i in range(size):
    if NSL_index[i] == 0 and NSR_index == 0 :
        area = histogram[i] * 1
    else:
        area = histogram[i] * (abs(NSL_index[i] -  NSR_index[i])-1)
    if(res<area):
        res = area
        
print(res)
        