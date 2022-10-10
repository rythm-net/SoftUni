number_of_lines = int(input())

for i in range(number_of_lines):
    text = input()
    name = ""
    age = ""
    reading_name = False
    reading_age = False

    for j in range(len(text)):
        if text[j] == "|":
            reading_name = False
        if reading_name:
            name += text[j]
        if text[j] == "@":
            reading_name = True
        if text[j] == "*":
            reading_age = False
        if reading_age:
            age += text[j]
        if text[j] == "#":
            reading_age = True

    print(f'{name} is {age} years old.')