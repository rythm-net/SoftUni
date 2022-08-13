import math

tournaments_count = int(input())
start_points = int(input())
tournament_points = 0
tournaments_won = 0

for tournament in range(tournaments_count):
    tournament_name = input()
    if tournament_name == "W":
        tournament_points += 2000
        tournaments_won += 1
    if tournament_name == "F":
        tournament_points += 1200
    if tournament_name == "SF":
        tournament_points += 720

final_points = start_points + tournament_points
average_points = math.floor(tournament_points / tournaments_count)
percent_tournaments_won = (tournaments_won / tournaments_count) * 100

print(f"Final points: {final_points}")
print(f"Average points: {average_points}")
print(f"{percent_tournaments_won:.2f}%")