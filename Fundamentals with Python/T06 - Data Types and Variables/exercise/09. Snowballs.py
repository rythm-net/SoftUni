number_of_snowballs = int(input())
max_snowball_value = 0
max_snow = 0
max_time = 0
max_quality = 0

for ball in range(1, number_of_snowballs + 1):
    snow = int(input())
    time = int(input())
    quality = int(input())
    snowball_value = (snow/time) ** quality

    if snowball_value >= max_snowball_value:
        max_snowball_value = int(snowball_value)
        max_snow = snow
        max_time = time
        max_quality = quality

print(f'{max_snow} : {max_time} = {max_snowball_value} ({max_quality})')