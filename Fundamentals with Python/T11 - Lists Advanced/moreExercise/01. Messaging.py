numbers = input().split(' ')
numbers = list(map(int, numbers))
string = list(input())

for num in numbers:
    idx = sum(int(digit) for digit in str(num))
    if idx < len(string):
        print(string.pop(idx), end='')
    else:
        idx = idx - len(string)
        print(string.pop(idx), end='')