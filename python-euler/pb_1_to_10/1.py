'''
Sum of all multiples of 3 or 5 below 1k
'''

res = 0

for number in range(3,1000):
    if number % 3 == 0 or number % 5 == 0 :
        res += number

print(f"{res}")