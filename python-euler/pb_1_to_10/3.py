'''
largest prime factor of the number 600851475143
'''

number = 600851475143

max_factor = 1
next_factor = 2

while number > 1:
    if number % next_factor == 0 :
        number = number / next_factor
        max_factor = next_factor
    else :
        if next_factor == 2 : next_factor+=1
        else : next_factor += 2

print(max_factor)
