'''
difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
'''
import time, math
start_time = time.time()

def sum_of_squares(n: int):
    sum = 0
    for index in range (n+1):
        sum += math.pow(index,2)
    return sum

def square_of_sum(n: int):
    sum = 0
    for index in range (n+1):
        sum += index
    return math.pow(sum,2)

max = 100
result = abs(sum_of_squares(max) - square_of_sum(max))

print(result)
print(f"--- {time.time()-start_time} seconds ---")