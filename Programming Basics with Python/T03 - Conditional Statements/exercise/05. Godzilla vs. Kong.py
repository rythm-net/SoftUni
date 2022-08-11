budget = float(input())
walkers = int(input())
costumes_price = float(input())

stage = budget * 0.10
costumes_cost = walkers * costumes_price
discount = costumes_cost * 0.10

total_cost = stage + costumes_cost

if walkers >= 150:
    total_cost = total_cost - discount

diff = abs(budget - total_cost)

if total_cost <= budget:
    print('Action!')
    print(f'Wingard starts filming with {diff:.2f} leva left.')
else:
    print('Not enough money!')
    print(f'Wingard needs {diff:.2f} leva more.')