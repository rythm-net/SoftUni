n = int(input())

capacity = 255
poured_liters = 0

for i in range(n):
    liters = int(input())
    if poured_liters + liters > capacity:
        print('Insufficient capacity!')
    else:
        poured_liters += liters

print(poured_liters)