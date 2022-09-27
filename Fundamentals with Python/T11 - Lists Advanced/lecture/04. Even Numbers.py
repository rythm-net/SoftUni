string_with_numbers = input()

numbers = string_with_numbers.split(", ")
numbers = [int(number) for number in numbers]

indexes_of_even_numbers = []

for index, number in enumerate(numbers):
    if number % 2 == 0:
        indexes_of_even_numbers.append(index)

print(indexes_of_even_numbers)