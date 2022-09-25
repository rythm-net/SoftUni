a = int(input())
b = int(input())
c = int(input())

def add_and_subtract(a, b, c):

    def sum_numbers(a, b):
        result = a + b
        return result
    def subtract(sum, c):
        result = sum - c
        return result

    return subtract(sum_numbers(a, b), c)

print(add_and_subtract(a, b, c))