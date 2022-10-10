text = " ".join(input().split()).split(" ")

final_result = 0

for i in range(len(text)):
    result = 0
    number = int(text[i][1:-1: 1])

    if 65 <= ord(text[i][0]) <= 90:
        divider = ord(text[i][0]) - 64
        result = number / divider
    elif 97 <= ord(text[i][0]) <= 122:
        multiplier = ord(text[i][0]) - 96
        result = number * multiplier

    if 65 <= ord(text[i][-1]) <= 90:
        subtractor = ord(text[i][-1]) - 64
        result = result - subtractor
    elif 97 <= ord(text[i][-1]) <= 122:
        adder = ord(text[i][-1]) - 96
        result = result + adder

    final_result += result

print(f'{final_result:.2f}')