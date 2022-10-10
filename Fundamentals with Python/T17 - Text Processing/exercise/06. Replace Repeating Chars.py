string = input()

for i in range(len(string)):
    if i < len(string) - 1:
        if string[i] == string[i + 1]:
            pass
        elif string[i] != string[i + 1]:
            print(string[i], end="")
    if i == len(string) - 1:
        print(string[i])

# print(string)