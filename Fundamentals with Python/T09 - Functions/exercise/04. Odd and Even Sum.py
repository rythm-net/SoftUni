number = input()

def odd_even_sum(number):
    sum_odd = 0
    sum_even = 0

    for digit in number:
        digit = int(digit)
        if digit % 2 == 0:
             sum_even += digit
        else:
            sum_odd += digit

    return f'Odd sum = {sum_odd}, Even sum = {sum_even}'

print(odd_even_sum(number))