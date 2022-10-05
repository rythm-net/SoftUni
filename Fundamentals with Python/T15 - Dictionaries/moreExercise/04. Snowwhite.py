dwarfs = {}

while True:
    command = input()
    if command == "Once upon a time":
        break
    else:
        command = command.split(" <:> ")
        name = command[0]
        hat_color = command[1]
        physics = int(command[2])
        if hat_color not in dwarfs:
            dwarfs[hat_color] = {name: physics}
        elif name in dwarfs[hat_color]:
            if dwarfs[hat_color][name] < physics:
                del dwarfs[hat_color][name]
                dwarfs[hat_color][name] = physics
        elif hat_color in dwarfs and name not in dwarfs[hat_color]:
            dwarfs[hat_color][name] = physics

ordered_list = []
for hat, values in dwarfs.items():
    for name, physics in values.items():
        ordered_list.append({'len': len(values), 'name': name, 'physics': physics, 'hat': hat})

sorted_dwarfs = sorted(ordered_list, key=lambda item: (-item['physics'], -item['len']))

for dwarf in sorted_dwarfs:
    print(f'({dwarf["hat"]}) {dwarf["name"]} <-> {dwarf["physics"]}')