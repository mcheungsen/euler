'''
Fibonacci sequence = adding 2 previous terms

sum of the even-valued terms below 4 000 000
'''

result = 2

previous = 1
fibonacci = 2
max = 4_000_000

while fibonacci < max :
    next = previous + fibonacci
    previous = fibonacci
    fibonacci = next

    if fibonacci % 2 == 0 :
        result += fibonacci

print(result)