hour = int(input())
minutes = int(input())

prediction_minutes = 15
total_minutes = minutes + prediction_minutes

if total_minutes > 59:
    total_minutes = total_minutes - 60
    hour += 1
if hour > 23:
    hour = 0

print(f'{hour}:{total_minutes:02}')