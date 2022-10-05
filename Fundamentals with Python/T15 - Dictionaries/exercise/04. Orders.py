products = {}

while True:
    command = input().split(" ")
    if command[0] == "buy":
        break
    else:
        product = command[0]
        price = float(command[1])
        quantity = int(command[2])

    if product not in products:
        products[product] = {'price': price, 'quantity': quantity}
    else:
        products[product]['price'] = price
        products[product]['quantity'] += quantity

for key, value in products.items():
    product = key
    price = value['price']
    quantity = value['quantity']
    total = price * quantity
    print(f"{product} -> {total:.2f}")