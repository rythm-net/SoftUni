n = int(input())
positive_numbers = []
negative_numbers = []

for i in range(n):
    number = int(input())
    if number >= 0:
        positive_numbers.append(number)
    elif number < 0:
        negative_numbers.append(number)

print(positive_numbers)
print(negative_numbers)
print(f'Count of positives: {len(positive_numbers)}')

negative_sum = 0
for i in negative_numbers:
    negative_sum += i

print(f'Sum of negatives: {negative_sum}')