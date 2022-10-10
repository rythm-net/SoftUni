key = input().split(" ")
key = [int(number) for number in key]

command = input()

while command != "find":
    text = command
    new_string = ""
    j = 0

    for i in range(len(text)):
        new_letter = chr(ord(text[i]) - key[j])
        j += 1
        if j > len(key) - 1:
            j = 0
        new_string += new_letter

    # print(new_string)
    secret_message = ""
    type_found = False
    coordinates_found = False
    count = 0
    type = ""
    coordinates = ""

    for x in range(len(new_string)):
        if new_string[x] == "&" and count == 1:
            type_found = False
            # count = 0
        if type_found:
            type += new_string[x]
        if new_string[x] == "&" and count == 0:
            type_found = True
            count += 1
        if new_string[x] == ">":
            coordinates_found = False
        if coordinates_found:
            coordinates += new_string[x]
        if new_string[x] == "<":
            coordinates_found = True

print(f'Found {type} at {coordinates}')
command = input()