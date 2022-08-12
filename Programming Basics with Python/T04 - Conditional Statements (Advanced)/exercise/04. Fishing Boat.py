budget = int(input())
season = str(input())
number_fishermen = int(input())
boat_price = 0
money_left = 0
money_short = 0

if season == "Spring":
    boat_price = 3000
    if number_fishermen <= 6:
        boat_price -= boat_price * 0.10
    elif 7 <= number_fishermen <= 11:
        boat_price -= boat_price * 0.15
    elif number_fishermen >= 12:
        boat_price -= boat_price * 0.25

elif season == "Summer" or season == "Autumn":
    boat_price = 4200
    if number_fishermen <= 6:
        boat_price -= boat_price * 0.10
    elif 7 <= number_fishermen <= 11:
        boat_price -= boat_price * 0.15
    elif number_fishermen >= 12:
        boat_price -= boat_price * 0.25

elif season == "Winter":
    boat_price = 2600
    if number_fishermen <= 6:
        boat_price -= boat_price * 0.10
    elif 7 <= number_fishermen <= 11:
        boat_price -= boat_price * 0.15
    elif number_fishermen >= 12:
        boat_price -= boat_price * 0.25

if number_fishermen % 2 == 0:
    if season == "Spring" or season == "Summer" or season == "Winter":
        boat_price -= boat_price * 0.05

if budget >= boat_price:
    money_left = budget - boat_price
    print(f"Yes! You have {money_left:.2f} leva left.")
elif budget < boat_price:
    money_short = boat_price - budget
    print(f"Not enough money! You need {money_short:.2f} leva.")