a = int(input())
b = int(input())
c = int(input())

def find_smallest_number(a, b, c):
    numbers = [a, b, c]
    smallest_number = 10000000000
    for number in numbers:
        if number < smallest_number:
            smallest_number = number
    return smallest_number

print(find_smallest_number(a, b, c))