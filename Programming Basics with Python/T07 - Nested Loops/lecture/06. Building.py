number_of_floors = int(input())
number_of_rooms = int(input())

for x in range(number_of_floors, 0, -1):
    current_floor = x * 10
    for a in range(number_of_rooms):
        current_number_of_room = current_floor + a
        if x == number_of_floors:
            print(f"L{current_number_of_room}", end=" ")
        elif x % 2 != 0:
            print(f"A{current_number_of_room}", end=" ")
        else:
            print(f"O{current_number_of_room}", end=" ")

    print()