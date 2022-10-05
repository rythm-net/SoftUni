string = input().split(" ")
products_to_search = input().split(" ")

stock = {}
key, value = "", 0

for i in range(len(string)):
    if i % 2 == 0 or i == 0:
        key = string[i]
    elif i % 2 != 0:
        value = int(string[i])
        stock[key] = value

for product in products_to_search:
    if product in stock:
        print(f'We have {stock[product]} of {product} left')
    else:
        print(f"Sorry, we don't have {product}")