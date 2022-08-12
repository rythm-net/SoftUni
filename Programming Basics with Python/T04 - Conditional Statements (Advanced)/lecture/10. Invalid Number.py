number = int(input())

valid = 100 <= number <= 200 or number == 0

if not valid:
    print("invalid")