games_quantity = int(input())
hearthstone = 0
fornite = 0
overwatch = 0
others = 0

for game in range(0, games_quantity):
    game_name = input()
    if game_name == "Hearthstone":
        hearthstone += 1
    elif game_name == "Fornite":
        fornite += 1
    elif game_name == "Overwatch":
        overwatch += 1
    else:
        others += 1

hearthstone_p = (hearthstone / games_quantity) * 100
fornite_p = (fornite / games_quantity) * 100
overwatch_p = (overwatch / games_quantity) * 100
others_p = (others / games_quantity) * 100

print(f"Hearthstone - {hearthstone_p:.2f}%")
print(f"Fornite - {fornite_p:.2f}%")
print(f"Overwatch - {overwatch_p:.2f}%")
print(f"Others - {others_p:.2f}%")