from math import ceil

series_name = input()
series_time = int(input())
lunch_break = int(input())

lunch_time = lunch_break / 8
break_time = lunch_break / 4

time_left = lunch_break - lunch_time - break_time
total_time = abs(time_left - series_time)

if time_left >= series_time:
    print(f'You have enough time to watch {series_name} and left with {ceil(total_time)} minutes free time.')
else:
    print(f"You don't have enough time to watch {series_name}, you need {ceil(total_time)} more minutes.")