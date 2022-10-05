players = {}

command = input()

while not command == 'Season end':
    if '->' in command:
        player, position, skill = command.split(' -> ')
        if player not in players:
            players[player] = {}
            players[player][position] = int(skill)
        else:
            if position not in players[player]:
                players[player][position] = int(skill)
            else:
                if int(skill) > players[player][position]:
                    players[player][position] = int(skill)
    else:
        player1, player2 = command.split(' vs ')
        if player1 in players and player2 in players:
            common_position = False
            com_pos = ''
            for p1 in players[player1]:
                for p2 in players[player2]:
                    if p1 == p2:
                        com_pos = p1
                        common_position = True
            if common_position:
                if players[player1][com_pos] > players[player2][com_pos]:
                    players.pop(player2)
                elif players[player1][com_pos] < players[player2][com_pos]:
                    players.pop(player1)
    command = input()

player_skill={}
for key, value in players.items():
    player_skill[key] = 0
    for key1, value1 in value.items():
        player_skill[key] += value1

a = dict(sorted(player_skill.items(), key=lambda x: (-x[1], x[0])))

for player, total_skill in a.items():
    print(f'{player}: {total_skill} skill')
    b = dict(sorted(players[player].items(), key=lambda x:(-x[1], x[0])))
    for position, skill in b.items():
        print(f'- {position} <::> {skill}')