command = input()

while command != "end":
    string = command
    print(f'{string} = {string[::-1]}')

    command = input()