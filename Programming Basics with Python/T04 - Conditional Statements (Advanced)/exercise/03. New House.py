flower_type = input()
quantity = int(input())
budget = int(input())
price_flowers = 0
amount_left = 0
amount_short = 0

if flower_type == "Roses":
    price_flowers = quantity * 5
    if quantity > 80:
        price_flowers -= price_flowers * 0.10

elif flower_type == "Dahlias":
    price_flowers = quantity * 3.80
    if quantity > 90:
        price_flowers -= price_flowers * 0.15

elif flower_type == "Tulips":
    price_flowers = quantity * 2.80
    if quantity > 80:
        price_flowers -= price_flowers * 0.15

elif flower_type == "Narcissus":
    price_flowers = quantity * 3
    if quantity < 120:
        price_flowers += price_flowers * 0.15

elif flower_type == "Gladiolus":
    price_flowers = quantity * 2.50
    if quantity < 80:
        price_flowers += price_flowers * 0.20

if budget >= price_flowers:
    amount_left = budget - price_flowers
    print(f"Hey, you have a great garden with {quantity} {flower_type} and {amount_left:.2f} leva left.")

else:
    amount_short = price_flowers - budget
    print(f"Not enough money, you need {amount_short:.2f} leva more.")