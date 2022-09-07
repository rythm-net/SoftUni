budget = float(input())
flour_price_per_kg = float(input())

pack_eggs_price = 75 * flour_price_per_kg / 100
milk_250_price = 125 * flour_price_per_kg / 400
price_per_cozonak = flour_price_per_kg + pack_eggs_price + milk_250_price

cozonacs = 0
colored_eggs = 0
iterations = 0
lost_eggs = 0

while budget > 0:
    budget -= price_per_cozonak
    if budget <= 0:
        budget += price_per_cozonak
        break
    iterations += 1
    cozonacs += 1
    colored_eggs += 3
    if iterations % 3 == 0:
        lost_eggs=cozonacs -2
        colored_eggs -= lost_eggs

print(f'You made {cozonacs} cozonacs! Now you have {colored_eggs} eggs and {budget:.2f}BGN left.')