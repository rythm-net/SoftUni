string_of_numbers = input()
numbers_to_remove = int(input())

numbers_str = string_of_numbers.split(" ")
numbers = [int(number) for number in numbers_str]

for i in range(numbers_to_remove):
    min = 100000000000
    for j in numbers:
        if j < min:
            min = j
    numbers.remove(min)

numbers_str = [str(number) for number in numbers]
new_string = ", ".join(numbers_str)

print(new_string)