available_sum = 0

while True:
    destination = input()
    if destination == "End":
        break
    needed_money = float(input())

    while available_sum < needed_money:
        current_sum = float(input())
        available_sum += current_sum

    print(f"Going to {destination}!")
    available_sum = 0