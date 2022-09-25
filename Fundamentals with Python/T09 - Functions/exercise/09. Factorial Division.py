first_number = int(input())
second_number = int(input())

def factorial_division(x, y):

    def calculate_factorial(number):
        factorial = 1
        for x in range(1, number + 1):
            factorial *= x
        return factorial

    division = calculate_factorial(x) / calculate_factorial(y)
    print(f'{division:.2f}')

factorial_division(first_number, second_number)