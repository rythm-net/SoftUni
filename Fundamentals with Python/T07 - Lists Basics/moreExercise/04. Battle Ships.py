n = int(input())
rows = []

for i in range(n):
    row = list(map(int, input().split()))
    rows.append(row)

destroyed = 0
attacks = input().split()

for attack in attacks:
    attack = attack.split("-")
    index_of_row = int(attack[0])
    index_of_element = int(attack[1])

    for row in rows:
        for ind in row:
            if rows.index(row) == index_of_row and row.index(ind) == index_of_element:
                if row[ind] > 0:
                    row[ind] -= 1
                    if row[ind] <= 0:
                        destroyed += 1

print(destroyed)