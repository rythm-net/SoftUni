import re

text = input()
pattern_start = r'[^,\s]+'
matches_start = re.findall(pattern_start, text)
demons = {}

for match in matches_start:
    text = match
    pattern_health = r'[^0-9\+\-\*\.\/]'
    matches_health = re.findall(pattern_health, text)
    pattern_damage = r'([\-\+]?[0-9][.0-9]*)'
    matches_damage = re.findall(pattern_damage, text)
    pattern_mult_div = r'[/*]'
    matches_mult_div = re.findall(pattern_mult_div, text)
    total_health = 0

    for letter in matches_health:
        total_health += ord(letter)
    total_damage = 0

    for damage in matches_damage:
        total_damage += float(damage)

    for x in matches_mult_div:
        if x == "*":
            total_damage *= 2
        elif x == "/":
            total_damage /= 2
    demons[text] = {'health': total_health, 'damage': total_damage}

sorted_demons = sorted(demons)

for demon in sorted_demons:
    print(f'{demon} - {demons[demon]["health"]} health, {demons[demon]["damage"]:.2f} damage ')