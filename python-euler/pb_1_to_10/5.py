'''
Smallest positive number evenly divisible by all numbers from 1 to 20
'''
import time

start_time = time.time()


def divisible_by_one_to_x(number:int, x:int):
    for index in range (2,x + 1):
        if number % index != 0:
            return False
    return True

step = 20
number = step

while not divisible_by_one_to_x(number, step):
    number += step
    
print(number)
print(f"--- {time.time() - start_time} seconds ---")