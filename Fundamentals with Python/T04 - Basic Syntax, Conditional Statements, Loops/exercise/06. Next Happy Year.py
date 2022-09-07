year = int(input())

while True:
    year += 1
    zeros = 0
    ones = 0
    twos = 0
    threes = 0
    fours = 0
    fives = 0
    sixs = 0
    sevens = 0
    eights = 0
    nines = 0

    for char in str(year):
        if char == '0':
            zeros += 1
        elif char == '1':
            ones += 1
        elif char == '2':
            twos += 1
        elif char == '3':
            threes += 1
        elif char == '4':
            fours += 1
        elif char == '5':
            fives += 1
        elif char == '6':
            sixs += 1
        elif char == '7':
            sevens += 1
        elif char == '8':
            eights += 1
        elif char == '9':
            nines += 1

    if zeros < 2 \
            and ones < 2 \
            and twos < 2 \
            and threes < 2 \
            and fours < 2 \
            and fives < 2 \
            and sixs < 2 \
            and sevens < 2 \
            and eights < 2 \
            and nines < 2:
        print(year)
        break