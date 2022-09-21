strating_items = input()
start_budget = float(input())
budget = start_budget
train_ticket = 150

items = strating_items.split("|")

for item in items:
    splitted_item = item.split("->")
    item_type = splitted_item[0]
    item_price = float(splitted_item[1])

    if item_type == "Clothes" and item_price <= 50 and budget - item_price >= 0:
        budget -= item_price
        sell_price = item_price * 1.4
        print(f'{sell_price:.2f}', end = " ")

    elif item_type == "Shoes" and item_price <= 35 and budget - item_price >= 0:
        budget -= item_price
        sell_price = item_price * 1.4
        print(f'{sell_price:.2f}', end=" ")

    elif item_type == "Accessories" and item_price <= 20.50 and budget - item_price >= 0:
        budget -= item_price
        sell_price = item_price * 1.4
        print(f'{sell_price:.2f}', end=" ")
print()

profit = (start_budget - budget) * .4
print(f'Profit: {profit:.2f}')

money_collected = start_budget + profit

if money_collected >= train_ticket:
    print("Hello, France!")
else:
    print("Not enough money.")