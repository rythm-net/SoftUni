string = input()
dict = {}

for char in string:
    if char != " ":
        if char not in dict:
            dict[char] = 0
        dict[char] += 1

for key, value in dict.items():
    print(f'{key} -> {value}')