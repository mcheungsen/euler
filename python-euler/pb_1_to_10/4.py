'''
largest palindrome made from the product of two 3-digit numbers
'''
import math

def is_palindrome(number):
    text_number = str(number)
    for index in range (math.ceil(len(text_number)/2)):
        if text_number[index] != text_number[len(text_number)-1-index]:
            return False
    return True

min = 100
max = 1000
largest_palindrome = 0

for i in range(min, max):
    for j in range(min,max):
        product = i*j
        if is_palindrome(product) and largest_palindrome < product:
            largest_palindrome = product

print(largest_palindrome)