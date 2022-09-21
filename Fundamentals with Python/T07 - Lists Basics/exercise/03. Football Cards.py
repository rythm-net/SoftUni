cards = input()

teamA = ["A-1", "A-2", "A-3", "A-4", "A-5", "A-6", "A-7", "A-8", "A-9", "A-10", "A-11"]
teamB = ["B-1", "B-2", "B-3", "B-4", "B-5", "B-6", "B-7", "B-8", "B-9", "B-10", "B-11"]

splitted_cards = cards.split(" ")
game_terminated = False

for card in splitted_cards:
    if card[0] == "A" and card in teamA:
        teamA.remove(card)
    elif card[0] == "B" and card in teamB:
        teamB.remove(card)
    if len(teamA) < 7 or len(teamB) < 7:
        game_terminated = True
        break

print(f'Team A - {len(teamA)}; Team B - {len(teamB)}')

if game_terminated:
    print("Game was terminated")