stock = {}

while True:
    command = input()
    if command == "statistics":
        break
    else:
        command = command.split(": ")
        key = command[0]
        value = int(command[1])
        if key in stock:
            stock[key] += value
        else:
            pass
            stock[key] = value

print("Products in stock:")
total_products = 0
total_quantity = 0

for key, value in stock.items():
    print(f'- {key}: {value}')
    total_products += 1
    total_quantity += value

print(f'Total Products: {len(stock.keys())}')
print(f'Total Quantity: {sum(stock.values())}')