items = input().split(", ")

data = input()


def is_item_in_list(items_list, i):
    if i in items_list:
        return True
    return False


def collect_item(items_list, i):
    if not is_item_in_list(items_list, i):
        items_list.append(i)
    return items_list


def drop_item(items_list, i):
    if is_item_in_list(items_list, i):
        items_list.remove(i)
    return items_list


def combine_items(items_list, i):
    old_item = i.split(":")[0]
    new_item = i.split(":")[1]
    if is_item_in_list(items_list, old_item):
        index_old_item = items_list.index(old_item)
        index_new_item = index_old_item + 1
        items_list.insert(index_new_item, new_item)
    return items_list


def renew_item(items_list, i):
    if is_item_in_list(items_list, i):
        items_list.remove(i)
        items_list.append(i)
    return items_list


while not data == "Craft!":
    command, item = data.split(" - ")

    if command == "Collect":
        items = collect_item(items, item)
    elif command == "Drop":
        items = drop_item(items, item)
    elif command == "Combine Items":
        items = combine_items(items, item)
    elif command == "Renew":
        items = renew_item(items, item)

    data = input()

print(", ".join(items))