budget = float(input())
video = int(input())
cpu = int(input())
ram = int(input())

video_price = 250
video_cost = video * video_price

cpu_price = video_cost * 0.35
cpu_cost = cpu * cpu_price

ram_price = video_cost * 0.10
ram_cost = ram * ram_price

final_cost = 0
discount = 0.15
total_cost = video_cost + cpu_cost + ram_cost

if video > cpu:
    total_cost = total_cost - total_cost * discount
else:
    total_cost = video_cost + cpu_cost + ram_cost

if budget >= total_cost:
    final_cost = budget - total_cost
    print(f'You have {final_cost:.2f} leva left!')
else:
    final_cost = total_cost - budget
    print(f'Not enough money! You need {final_cost:.2f} leva more!')