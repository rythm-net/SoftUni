factor = int(input())
count = int(input())

new_list = []

for i in range(1, count + 1):
    number = i * factor
    new_list.append(number)

print(new_list)