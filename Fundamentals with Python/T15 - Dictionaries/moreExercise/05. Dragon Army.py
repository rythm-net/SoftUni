n = int(input())
dragons = {}

for _ in range(n):
    info = input()
    type_d, name, damage, health, armor = info.split()
    if type_d not in dragons:
        dragons[type_d] = {}
        dragons[type_d][name] = []
        if damage == 'null':
            dragons[type_d][name].append(45)
        else:
            dragons[type_d][name].append(int(damage))
        if health == 'null':
            dragons[type_d][name].append(250)
        else:
            dragons[type_d][name].append(int(health))
        if armor == 'null':
            dragons[type_d][name].append(10)
        else:
            dragons[type_d][name].append(int(armor))
    else:
        dragons[type_d][name] = []
        if damage == 'null':
            dragons[type_d][name].append(45)
        else:
            dragons[type_d][name].append(int(damage))
        if health == 'null':
            dragons[type_d][name].append(250)
        else:
            dragons[type_d][name].append(int(health))
        if armor == 'null':
            dragons[type_d][name].append(10)
        else:
            dragons[type_d][name].append(int(armor))

for color, value in dragons.items():
    total_damage = 0
    total_health = 0
    total_armor = 0
    num_of_dragons_per_type = len(value)
    for name, stats in value.items():
        total_damage += stats[0]
        total_health += stats[1]
        total_armor += stats[2]

    average_damage = total_damage / num_of_dragons_per_type
    average_health = total_health / num_of_dragons_per_type
    average_armor = total_armor / num_of_dragons_per_type

    print(f'{color}::({average_damage:.2f}/{average_health:.2f}/{average_armor:.2f})')
    b = dict(sorted(value.items(), key=lambda x: x[0]))
    for name, stats in b.items():
        print(f'-{name} -> damage: {stats[0]}, health: {stats[1]}, armor: {stats[2]}')