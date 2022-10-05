contest_password = input()
contest_password_dict = {}

while not contest_password == 'end of contests':
    contest, password = contest_password.split(':')
    contest_password_dict[contest] = password
    contest_password = input()

person_contest_points = {}

submission = input()

while not submission == 'end of submissions':
    contest, password, name, points = submission.split('=>')
    if contest in contest_password_dict and password == contest_password_dict[contest]:
        if name not in person_contest_points:
            person_contest_points[name] = {}
            person_contest_points[name][contest] = int(points)
        else:
            if contest in person_contest_points[name]:
                if int(points) > person_contest_points[name][contest]:
                    person_contest_points[name][contest] = int(points)
            else:
                person_contest_points[name][contest] = int(points)
    submission = input()

winner = ''
winner_points = 0

for key, value in person_contest_points.items():
    total_points = 0
    for key1, value1 in value.items():
        total_points += value1
    if total_points > winner_points:
        winner_points = total_points
        winner = key

print(f'Best candidate is {winner} with total {winner_points} points.')
print('Ranking:')

a = dict(sorted(person_contest_points.items(), key=lambda x: x[0]))

for key, value in a.items():
    print(f'{key}')
    b = dict(sorted(value.items(), key=lambda x: -x[1]))
    for key1, value1 in b.items():
        print(f'#  {key1} -> {value1}')