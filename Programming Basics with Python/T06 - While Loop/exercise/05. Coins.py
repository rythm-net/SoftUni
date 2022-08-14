change = float(input())
change_in_coins = int(change * 100)
coins = 0

while change_in_coins > 0:
    if change_in_coins - 200 >= 0:
        change_in_coins -= 200
        coins += 1
    elif change_in_coins - 100 >= 0:
        change_in_coins -= 100
        coins += 1
    elif change_in_coins - 50 >= 0:
        change_in_coins -= 50
        coins += 1
    elif change_in_coins - 20 >= 0:
        change_in_coins -= 20
        coins += 1
    elif change_in_coins - 10 >= 0:
        change_in_coins -= 10
        coins += 1
    elif change_in_coins - 5 >= 0:
        change_in_coins -= 5
        coins += 1
    elif change_in_coins - 2 >= 0:
        change_in_coins -= 2
        coins += 1
    else:
        change_in_coins -= 1
        coins += 1

print(coins)