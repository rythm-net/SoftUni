import re

command = input()
pattern = r'>>([a-zA-Z]+)<<([0-9\.]+)!([0-9]+)'
products = []
grand_total = 0

while command != "Purchase":
    matches = re.findall(pattern, command)
    if len(matches) > 0 and len(matches[0]) == 3:
        # print(matches)
        product = matches[0][0]
        products.append(product)
        price = float(matches[0][1])
        quantity = int(matches[0][2])
        total = price * quantity
        grand_total += total
    command = input()

print('Bought furniture:')

for product in products:
    print(product)

print(f'Total money spend: {grand_total:.2f}')