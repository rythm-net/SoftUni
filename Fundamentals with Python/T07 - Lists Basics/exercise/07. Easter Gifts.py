string = input()
gifts = string.split(" ")

while True:
    command = input()
    if command == "No Money":
        break
    else:
        new_command = command.split(" ")

    if new_command[0] == "OutOfStock":
        for index, item in enumerate(gifts):
            if item == new_command[1]:
                gifts[index] = None

    elif new_command[0] == "Required":
        new_gift = new_command[1]
        index = int(new_command[2])
        if len(gifts) > index >= 0:
            gifts[index] = new_gift

    elif new_command[0] == "JustInCase":
        gifts[-1] = new_command[1]

new_gifts = [gift for gift in gifts if gift is not None]
final_gifts = " ".join(new_gifts)

print(final_gifts)