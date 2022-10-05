contest_name_points = {}
command = input()

while not command == 'no more time':
    name, contest, points = command.split(' -> ')
    if contest not in contest_name_points:
        contest_name_points[contest] = {}
        contest_name_points[contest][name] = int(points)
    else:
        if name not in contest_name_points[contest]:
            contest_name_points[contest][name] = int(points)
        else:
            if int(points) > contest_name_points[contest][name]:
                contest_name_points[contest][name] = int(points)
    command = input()

name_total_points = {}

for key, value in contest_name_points.items():
    for name, points in value.items():
        if name in name_total_points:
            name_total_points[name] += value[name]
        else:
            name_total_points[name] = 0
            name_total_points[name] += value[name]

for key, value in contest_name_points.items():
    a = dict(sorted(value.items(), key=lambda x: (-x[1], x[0])))
    print(f'{key}: {len(value)} participants')
    i = 1
    for key1, value1 in a.items():
        print(f'{i}. {key1} <::> {value1}')
        i += 1

print('Individual standings:')

b = dict(sorted(name_total_points.items(), key=lambda x: (-x[1], x[0])))

j = 1
for name, points in b.items():
    print(f'{j}. {name} -> {points}')
    j += 1