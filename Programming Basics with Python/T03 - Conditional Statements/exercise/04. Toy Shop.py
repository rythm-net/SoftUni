trip_price = float(input())
puzzle_count = int(input())
doll_count = int(input())
bear_count = int(input())
minion_count = int(input())
truck_count = int(input())

puzzle_price = 2.60
doll_price = 3.00
bear_price = 4.10
minion_price = 8.20
truck_price = 2.00

discount = 0
total_price = puzzle_count * puzzle_price + doll_count * doll_price + bear_count * bear_price + minion_count * minion_price + truck_count * truck_price
total_toys_count = puzzle_count + doll_count + bear_count + minion_count + truck_count

if total_toys_count >= 50:
    discount = total_price * 0.25
else:
    discount = 0

final_price = total_price - discount
rent = final_price * 0.10
profit = final_price - rent

if profit >= trip_price:
    profit = profit - trip_price
    print(f'Yes! {profit:.2f} lv left.')
else:
    profit = trip_price - profit
    print(f'Not enough money! {profit:.2f} lv needed.')