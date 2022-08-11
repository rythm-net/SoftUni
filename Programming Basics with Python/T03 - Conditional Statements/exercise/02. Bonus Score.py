num = int(input())

bonus_pts = 0

if num <= 100:
    bonus_pts += 5
elif 100 < num <= 1000:
    bonus_pts = num * 0.2
elif num > 1000:
    bonus_pts = num * 0.1

if num % 2 == 0:
    bonus_pts = bonus_pts + 1
elif num % 10 == 5:
    bonus_pts = bonus_pts + 2

print(bonus_pts)
print(num + bonus_pts)