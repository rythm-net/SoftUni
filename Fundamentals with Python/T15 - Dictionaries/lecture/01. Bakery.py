string = input().split(" ")

bakery = {}
key, value = "", 0

for i in range(len(string)):

    if i % 2 == 0 or i == 0:
        key = string[i]
    elif i % 2 != 0:
        value = int(string[i])
        bakery[key] = value

print(bakery)