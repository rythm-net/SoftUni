number = int(input())

def perfect_number(number):
    divisors = []
    if number > 0:
        for num in range(1, number):
            if number % num == 0:
                divisors.append(num)
    if sum(divisors) == number:
        print('We have a perfect number!')
    else:
        print("It's not so perfect.")

perfect_number(number)