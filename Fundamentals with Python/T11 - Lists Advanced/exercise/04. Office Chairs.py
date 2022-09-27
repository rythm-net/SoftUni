number_of_rooms = int(input())

free_chairs = 0
game_on = True

for room in range(1, number_of_rooms + 1):
    information = input()
    information = information.split(" ")
    chairs = len(information[0])
    visitors = int(information[1])

    if chairs < visitors:
        needed_chairs_in_room = visitors - chairs
        print(f'{needed_chairs_in_room} more chairs needed in room {room}')
        game_on = False
    else:
        free_chairs += chairs - visitors

if game_on:
    print(f'Game On, {free_chairs} free chairs left')