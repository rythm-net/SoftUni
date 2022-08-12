days = int(input())
room_type = input()
grade = input()

room_price = 18.00
apartment_price = 25.00
presidential_price = 35.00
nights = days - 1
total_price = 0

if days < 10:
    if room_type == "room for one person":
        total_price = room_price * nights
    elif room_type == "apartment":
        total_price = apartment_price * nights * 0.70
    elif room_type == "president apartment":
        total_price = presidential_price * nights * 0.90

elif 10 <= days <= 15:
    if room_type == "room for one person":
        total_price = room_price * nights
    elif room_type == "apartment":
        total_price = apartment_price * nights * 0.65
    elif room_type == "president apartment":
        total_price = presidential_price * nights * 0.85

elif days > 15:
    if room_type == "room for one person":
        total_price = room_price * nights
    elif room_type == "apartment":
        total_price = apartment_price * nights * 0.50
    elif room_type == "president apartment":
        total_price = presidential_price * nights * 0.80

if grade == "positive":
    total_price = total_price * 1.25

elif grade == "negative":
    total_price = total_price * 0.90

print(f"{total_price:.2f}")