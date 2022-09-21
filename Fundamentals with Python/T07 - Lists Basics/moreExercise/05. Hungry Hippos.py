n = int(input())

field = {}
keys = range(n)
values = []

for i in keys:
    values = input().split(' ')
    values = [int(i) for i in values]
    field[i] = values

m = len(values)

blocks = []

for i in range(n):
    for j in range(m):
        if field[i][j] == 1:
            neighbors = [str(i) + str(j)]
            if i-1 >= 0:
                if field[i-1][j] == 1:
                    neighbors.append(str(i-1) + str(j))
            if i+1 < n:
                if field[i+1][j] == 1:
                    neighbors.append(str(i+1) + str(j))
            if j-1 >= n:
                if field[i][j-1] == 1:
                    neighbors.append(str(i) + str(j-1))
            if j+1 < m:
                if field[i][j+1] == 1:
                    neighbors.append(str(i) + str(j+1))
            blocks.append(neighbors)

for i in range(len(blocks)):
    if not blocks[i] == '':
        for j in range(len(blocks)):
            if j == i:
                continue
            intersection = list(set(blocks[i]).intersection(blocks[j]))
            if len(intersection) > 0:
                blocks[i] = list(set(blocks[i] + blocks[j]))
                blocks[j] = ''

while '' in blocks:
    blocks.remove('')

print(len(blocks))