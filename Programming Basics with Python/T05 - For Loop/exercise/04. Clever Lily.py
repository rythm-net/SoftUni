age = int(input())
price_wash_machine = float(input())
toy_price = int(input())

money = 10
count_toys = 0
sum = 0
brother_count = 0

for i in range(1, age + 1):
    if i % 2 != 0:
        count_toys += 1
    else:
        brother_count += 1
        sum = sum + money
        money = money + 10

result = sum + (count_toys * toy_price) - brother_count

diff = abs(result - price_wash_machine)
if result >= price_wash_machine:
    print(f"Yes! {diff:.2f}")
else:
    print(f"No! {diff:.2f}")