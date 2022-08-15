n = int(input())
counter = 0

for n1 in range(0, n + 1):
    for n2 in range(0, n + 1):
        for n3 in range(0, n + 1):
            if n1 + n2 + n3 == n:
                counter += 1

print(counter)