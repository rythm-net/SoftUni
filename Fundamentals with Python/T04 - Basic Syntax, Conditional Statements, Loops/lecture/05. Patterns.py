columns = int(input())

for row in range(1, columns +1):
    print('*' * row)

for i in range(columns -1, 0, -1):
    print('*' * i)