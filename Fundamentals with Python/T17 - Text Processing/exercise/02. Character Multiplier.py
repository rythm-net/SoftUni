strings = input().split()
string1 = strings[0]
string2 = strings[1]

total_sum = 0

if len(string1) > len(string2):
    for i in range(len(string2)):
        multiplication = ord(string1[i]) * ord(string2[i])
        total_sum += multiplication
    for i in range(1, len(string1) - len(string2) + 1):
        number = ord(string1[i * -1])
        total_sum += number

elif len(string1) < len(string2):
    for i in range(len(string1)):
        multiplication = ord(string1[i]) * ord(string2[i])
        total_sum += multiplication
    for i in range(1, len(string2) - len(string1) + 1):
        number = ord(string2[i * -1])
        total_sum += number

elif len(string1) == len(string2):
    for i in range(len(string1)):
        multiplication = ord(string1[i]) * ord(string2[i])
        total_sum += multiplication
    for i in range(1, len(string2) - len(string1) + 1):
        number = ord(string2[i * -1])
        total_sum += number

print(total_sum)