n = int(input())

for i in range(1,n+1):
    sum_digits = 0
    is_special = False
    m = i

    while i > 0:
        sum_digits += i % 10
        i = i // 10
    if sum_digits == 5 or sum_digits == 7 or sum_digits == 11:
        is_special = True

    print(f'{m} -> {is_special}')