days = int(input())
money_won = 0
total_wins = 0
total_loses = 0

for day in range(1, days+1):
    result = input()
    money_won_per_day = 0
    wins = 0
    loses = 0

    while result != "Finish":
        result = input()
        if result == "win":
            wins += 1
            money_won_per_day += 20
        elif result == "lose":
            loses += 1
    if wins > loses:
        money_won_per_day *= 1.1
        total_wins += 1
    else:
        total_loses += 1
    money_won += money_won_per_day
total_money = 0

if total_wins > total_loses:
    total_money = money_won * 1.2
    print(f"You won the tournament! Total raised money: {total_money:.2f}")
else:
    total_money = money_won
    print(f"You lost the tournament! Total raised money: {total_money:.2f}")