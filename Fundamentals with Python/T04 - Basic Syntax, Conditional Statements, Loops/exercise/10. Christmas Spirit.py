quantity = int(input())
days = int(input())

ornament_set_price = 2
tree_skirt_price = 5
tree_garlands_price = 3
tree_lights_price = 15

total = 0
christmas_spirit = 0

for day in range(1, days + 1):
    if day % 2 == 0:
        total += quantity * ornament_set_price
        christmas_spirit += 5
    if day % 3 == 0:
        total += quantity * (tree_skirt_price + tree_garlands_price)
        christmas_spirit += 13
    if day % 5 == 0:
        total += quantity * tree_lights_price
        christmas_spirit += 17
        if day % 3 == 0:
            christmas_spirit += 30
    if day % 10 == 0:
        christmas_spirit -= 20
        total += tree_skirt_price + tree_garlands_price + tree_lights_price
    if day % 11 == 0:
        for i in range(day, days + 1):
            if i % 2 == 0:
                total += 2 * ornament_set_price
            if i % 3 == 0:
                total += 2 * (tree_skirt_price+tree_garlands_price)
            if i % 5 == 0:
                total += 2 * tree_lights_price

if days % 10 == 0:
    christmas_spirit -= 30

print(f'Total cost: {total}')
print(f'Total spirit: {christmas_spirit}')