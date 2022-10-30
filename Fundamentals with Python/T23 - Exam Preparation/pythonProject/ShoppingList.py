items = input().split("!")

command = input()


def check_item_exist(items_list, item_searched):
    return True if item_searched in items_list else False


while not command == "Go Shopping!":
    command_type = command.split()[0]
    item = command.split()[1]

    if command_type == "Urgent":
        if not check_item_exist(items, item):
            items.insert(0, item)
    elif command_type == "Unnecessary":
        if check_item_exist(items, item):
            items.remove(item)
    elif command_type == "Correct":
        if check_item_exist(items, item):
            new_item = command.split()[2]
            current_index = items.index(item)
            items[current_index] = new_item

    elif command_type == "Rearrange":
        if check_item_exist(items, item):
            items.remove(item)
            items.append(item)

    command = input()

print(", ".join(items))