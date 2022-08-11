from math import floor

seconds_first = int(input())
seconds_second = int(input())
seconds_third = int(input())

total_seconds = seconds_first + seconds_second + seconds_third

minutes = total_seconds // 60
seconds = total_seconds % 60
minutes = floor(minutes)

if seconds < 10:
    print(f'{minutes}:0{seconds}')
else:
    print(f'{minutes}:{seconds}')