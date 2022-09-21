n = int(input())
numbers = []

for i in range(n):
    number = int(input())
    numbers.append(number)

filter_word = input()
filtered_numbers = []

if filter_word == "even":
    filtered_numbers = [number for number in numbers if number % 2 == 0]
elif filter_word == "odd":
    filtered_numbers = [number for number in numbers if number % 2 != 0]
elif filter_word == "negative":
    filtered_numbers = [number for number in numbers if number < 0]
elif filter_word == "positive":
    filtered_numbers = [number for number in numbers if number >= 0]

print(filtered_numbers)