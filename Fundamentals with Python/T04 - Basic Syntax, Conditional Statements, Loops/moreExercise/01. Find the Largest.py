number = int(input())
list_digits = []

for digit in (str(number)):
    list_digits.append(digit)
    list_digits.sort(reverse=True)
print(''.join(list_digits))