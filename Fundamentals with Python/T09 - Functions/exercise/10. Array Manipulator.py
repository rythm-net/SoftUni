import sys

the_list = [int(item) for item in input().split()]

while True:
    command = input().split()
    if command[0] == "end":
        break

    elif command[0] == "exchange":
        index_to_exchange = int(command[1])
        if len(the_list) > index_to_exchange >= 0:
            the_list = the_list[index_to_exchange + 1:] + the_list[:index_to_exchange + 1]
        else:
            print("Invalid index")

    elif command[0] == "max":
        max_number = -sys.maxsize - 1
        index_of_number = -1
        if command[1] == "even":
            for number in range(len(the_list)):
                if the_list[number] % 2 == 0 and the_list[number] >= max_number:
                    max_number = the_list[number]
                    index_of_number = number
        elif command[1] == "odd":
            for number in range(len(the_list)):
                if the_list[number] % 2 != 0 and the_list[number] >= max_number:
                    max_number = the_list[number]
                    index_of_number = number
        if index_of_number == -1:
            print("no matches")
        else:
            print(index_of_number)

    elif command[0] == "min":
        min_number = sys.maxsize
        index_of_number = -1
        if command[1] == "even":
            for number in range(len(the_list)):
                if the_list[number] % 2 == 0 and the_list[number] <= min_number:
                    min_number = the_list[number]
                    index_of_number = number
        elif command[1] == "odd":
            for number in range(len(the_list)):
                if the_list[number] % 2 != 0 and the_list[number] <= min_number:
                    min_number = the_list[number]
                    index_of_number = number
        if index_of_number == -1:
            print("No matches")
        else:
            print(index_of_number)

    elif command[0] == "first":
        count_numbers = int(command[1])
        if count_numbers > len(the_list):
            print("Invalid count")
            continue
        if command[2] == "even":
            print([item for item in the_list if item % 2 == 0][:count_numbers])
        elif command[2] == "odd":
            print([item for item in the_list if item % 2 != 0][:count_numbers])

    elif command[0] == "last":
        count_numbers = int(command[1])
        if count_numbers > len(the_list):
            print("Invalid count")
            continue
        if command[2] == "even":
            print([item for item in the_list if item % 2 == 0][-count_numbers:])
        elif command[2] == "odd":
            print([item for item in the_list if item % 2 != 0][-count_numbers:])

print(the_list)