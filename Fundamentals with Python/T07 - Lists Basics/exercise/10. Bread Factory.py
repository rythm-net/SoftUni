energy = 100
coins = 100

starting_events = input()
events = starting_events.split("|")
finished = True

for event in events:
    splitted_event = event.split("-")
    name = splitted_event[0]
    number = int(splitted_event[1])

    if name == "rest":
        if energy + number > 100:
            gained_energy = 100 - energy
            energy = 100
        else:
            gained_energy = number
            energy += gained_energy
        print(f'You gained {gained_energy} energy.')
        print(f'Current energy: {energy}.')

    elif name == "order":
        gained_coins = number
        if energy - 30 >= 0:
            print(f'You earned {gained_coins} coins.')
            coins += gained_coins
            energy -= 30
        else:
            energy += 50
            print("You had to rest!")

    else:
        ingredient = name
        price = number
        if coins - price >= 0:
            coins -= price
            print(f'You bought {ingredient}.')
        else:
            print(f'Closed! Cannot afford {ingredient}.')
            finished = False
            break

if finished:
    print("Day completed!")
    print(f"Coins: {coins}")
    print(f"Energy: {energy}")