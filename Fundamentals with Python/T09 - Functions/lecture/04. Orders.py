product = input()
quantity = int(input())

def calculate_order(product, quantity):
    order = 0
    if product == "coffee":
        order = 1.5 * quantity
    elif product == "coke":
        order = 1.4 * quantity
    elif product == "water":
        order = 1 * quantity
    elif product == "snacks":
        order = 2 * quantity
    return f'{order:.2f}'

print(calculate_order(product, quantity))