int_string = input()
count_of_beggars = int(input())

income = int_string.split(", ")
int_income = [int(x) for x in income]

income_per_beggar = []

for beggar in range(1, count_of_beggars + 1):
    sum = 0
    next_sum = 0

    for n, y in enumerate(int_income, 1):
        if n == beggar:
            sum += y
            next_sum = n + count_of_beggars
        if next_sum == n:
            sum += y
            next_sum = n + count_of_beggars
    income_per_beggar.append(sum)

print(income_per_beggar)