names = input().split(", ")

valid_names = []

for name in names:
    if 3 <= len(name) <= 16:
        is_valid = True
        for letter in name:
            if letter == "_":
                pass
            elif letter == "-":
                pass
            elif letter.isalpha():
                pass
            elif letter.isdigit():
                pass
            else:
                is_valid = False
        if is_valid:
            print(name)