collected_materials = {
    'shards': 0,
    'fragments': 0,
    'motes': 0
}

item_found = False

while True:
    if item_found:
        break
    materials = input().split(" ")

    for i in range(0, len(materials), 2):
        if item_found:
            break
        quantity = int(materials[i])
        material = materials[i + 1].lower()

        if material not in collected_materials:
            collected_materials[material] = 0
            collected_materials[material] += quantity

        if collected_materials['shards'] >= 250:
            print("Shadowmourne obtained!")
            collected_materials['shards'] -= 250
            item_found = True

        if collected_materials['fragments'] >= 250:
            print("Valanyr obtained!")
            collected_materials['fragments'] -= 250
            item_found = True

        if collected_materials['motes'] >= 250:
            print("Dragonwrath obtained!")
            collected_materials['motes'] -= 250
            item_found = True

for key, value in collected_materials.items():
    print(f'{key}: {value}')