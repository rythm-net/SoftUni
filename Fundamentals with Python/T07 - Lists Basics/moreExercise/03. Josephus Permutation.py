starting_list = input().split(" ")
k = int(input())

final_list = []
index = k - 1

while len(starting_list) > 0:
    temp_indexes = []

    while index < len(starting_list):
        temp_indexes.append(index)
        final_list.append(starting_list[index])
        index = index + k
    temp_indexes.reverse()
    index = index - len(starting_list)

    for i in temp_indexes:
        starting_list.pop(i)

print_result = ",".join(final_list)
print(f'[{print_result}]')
