import re

names = input().split(", ")
athletes = {}

for name in names:
    if name not in athletes:
        athletes[name] = 0

command = input()

while command != "end of race":
    text = command
    pattern_name = r'[A-Za-z]'
    matches_name = re.findall(pattern_name, text)
    name = "".join(matches_name)
    pattern_distance = r'[0-9]'
    matches_distance = re.findall(pattern_distance, text)
    matches_distance = [int(number) for number in matches_distance]
    distance = sum(matches_distance)

    if name in athletes and athletes[name] == 0:
        athletes[name] = distance
    elif name in athletes and athletes[name] > 0:
        athletes[name] += distance

    command = input()

sorted_athletes = sorted(athletes.items(), key=lambda kv: (kv[1]), reverse=True)

print(f'1st place: {sorted_athletes[0][0]}')
print(f'2nd place: {sorted_athletes[1][0]}')
print(f'3rd place: {sorted_athletes[2][0]}')