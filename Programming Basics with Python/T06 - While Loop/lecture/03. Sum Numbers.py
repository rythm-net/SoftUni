number = int(input())

sum_numbers = 0

while number != sum_numbers:
    if number <= sum_numbers:
        break
    new_number = int(input())
    sum_numbers += new_number

print(sum_numbers)