string = input()

letters = []
numbers = []

for letter in string:
    if letter.isdigit():
        numbers.append(letter)
    else:
        letters.append(letter)

take_list = []
skip_list = []

for i in range(1, len(numbers) + 1):
    if i % 2 != 0:
        take_list.append(numbers[i-1])
    else:
        skip_list.append(numbers[i-1])

take_list = [int(number) for number in take_list]
skip_list = [int(number) for number in skip_list]
current_sting = "".join(letters)
result_string = ""

for i in range(len(take_list)):
    m = take_list[i]
    n = skip_list[i]
    for take in range(m):
        if len(current_sting) > 0:
            result_string += current_sting[0]
            current_sting = current_sting[1:]
    for skip in range(n):
        if len(current_sting) > 0:
            current_sting = current_sting[1:]

print(result_string)