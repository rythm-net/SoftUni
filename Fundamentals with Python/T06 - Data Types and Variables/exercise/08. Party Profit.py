companions = int(input())
days = int(input())

coins = 0

for day in range(1,days+1):
    if day % 10 == 0:
        companions -= 2
    if day % 15 == 0:
        companions += 5
    coins += 50
    coins -= companions * 2
    if day % 3 == 0:
        coins -= 3 * companions
    if day % 5 == 0:
        coins += companions * 20
        if day % 3 == 0:
            coins -= 2 * companions

coins_per_companion = int(coins/companions)

print(f'{companions} companions received {coins_per_companion} coins each.')