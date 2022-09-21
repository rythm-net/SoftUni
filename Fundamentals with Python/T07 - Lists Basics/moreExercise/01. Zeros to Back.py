starting_string = input()

numbers_as_string = starting_string.split(", ")
numbers = [int(number) for number in numbers_as_string]

count_zeros = 0

for index, number in enumerate(numbers):
    if number == 0:
        count_zeros += 1
        numbers[index] = None

for zero in range(count_zeros):
    numbers.append(0)

final_numbers = [number for number in numbers if number is not None]

print(final_numbers)