n = int(input())
sum_of_chars = 0
for i in range(n):
    symbol = input()
    sum_of_chars += ord(f'{symbol}')

print(f'The sum equals: {sum_of_chars}')