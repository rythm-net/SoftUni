import re

pattern = r'%([A-Z][a-z]+)%[^\|\$\%\.]*<([\w]+)>[^\|\$\%\.]*\|([0-9]+)\|[^\|\$\%\.]*([1-9]+[.0-9]*)\$'
total_income = 0

while True:
    entry = input()
    if entry == "end of shift":
        break
    else:
        matches = re.findall(pattern, entry)
        if len(matches) > 0:
            name = matches[0][0]
            product = matches[0][1]
            count = int(matches[0][2])
            price = float(matches[0][3])
            total_price = count * price
            total_income += total_price
            print(f'{name}: {product} - {total_price:.2f}')

print(f'Total income: {total_income:.2f}')