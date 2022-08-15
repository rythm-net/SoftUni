number = int(input())

for current in range(1111, 10000):
    number_is_special = True
    current_as_string = str(current)

    for current_digit in current_as_string:
        if int(current_digit) == 0 or number % int(current_digit) != 0:
            number_is_special = False
            break
    if number_is_special:
        print(current, end=" ")