budget = float(input())
season = input()
destination = ""
type_holiday = ""
money_spent = 0

if budget <= 100:
    destination = "Bulgaria"
    if season == "summer":
        type_holiday = "Camp"
        money_spent = budget * 0.30
    elif season == "winter":
        type_holiday = "Hotel"
        money_spent = budget * 0.70

elif budget <= 1000:
    destination = "Balkans"
    if season == "summer":
        type_holiday = "Camp"
        money_spent = budget * 0.40
    elif season == "winter":
        type_holiday = "Hotel"
        money_spent = budget * 0.80

elif budget > 1000:
    destination = "Europe"
    type_holiday = "Hotel"
    money_spent = budget * 0.90

print(f"Somewhere in {destination}")
print(f"{type_holiday} - {money_spent:.2f}")