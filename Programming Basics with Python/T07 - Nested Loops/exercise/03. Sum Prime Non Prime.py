sum_prime = 0
sum_non_prime = 0
command = input()

while command != 'stop':
    current_num = int(command)
    if current_num < 0:
        print("Number is negative.")
    else:
        number_is_prime = True
        for number in range(2, current_num):
            if current_num % number == 0:
                number_is_prime = False
                break
        if number_is_prime:
            sum_prime += current_num
        else:
            sum_non_prime += current_num
    command = input()

print(f"Sum of all prime numbers is: {sum_prime}")
print(f"Sum of all non prime numbers is: {sum_non_prime}")