import re

number_of_messages = int(input())
pattern = r"[star]"
second_pattern = r'@([A-Za-z]+)([^@\-!:>]+)?:([0-9]+)!([AD])!([^@\-!:>]+)?->([0-9]+)'
attacked_planets = []
destroyed_planets = []

for i in range(number_of_messages):
    message = input()
    matches = re.findall(pattern, message, re.IGNORECASE)
    key = len(matches)
    new_message = ""
    for char in message:
        new_message += chr(ord(char) - key)
    new_matches = re.findall(second_pattern, new_message)
    if len(new_matches) > 0:
        planet_name = new_matches[0][0]
        attack_type = new_matches[0][3]
        if attack_type == "A":
            attacked_planets.append(planet_name)
        elif attack_type == "D":
            destroyed_planets.append(planet_name)

attacked_planets.sort()

print(f'Attacked planets: {len(attacked_planets)}')
for planet in attacked_planets:
    print(f'-> {planet}')

destroyed_planets.sort()

print(f'Destroyed planets: {len(destroyed_planets)}')
for planet in destroyed_planets:
    print(f'-> {planet}')