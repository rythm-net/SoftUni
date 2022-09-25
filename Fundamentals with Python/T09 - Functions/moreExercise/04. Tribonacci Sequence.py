number = int(input())

def find_tribonacci_sequence(number):

    def find_starting_sequence():
        first_found = False
        starting_sequence = []
        for x in range(1, 4):
            if first_found:
                break
            for y in range(1, 4):
                if first_found:
                    break
                for z in range(1, 4):
                    if x + y + z == 4:
                        starting_sequence.append(x)
                        starting_sequence.append(y)
                        starting_sequence.append(z)
                        first_found = True
                        break
        return starting_sequence

    starting_sequence = find_starting_sequence()

    if number <= 3:
        for i in range(0, number):
            print(f'{starting_sequence[i]} ', end="")
    elif number > 3:
        print(f'{starting_sequence[0]} {starting_sequence[1]} {starting_sequence[2]} ', end="")
        for x in range(3, number):
            next_number = starting_sequence[-1] + starting_sequence[-2] + starting_sequence [-3]
            starting_sequence.append(next_number)
            print(f'{next_number}', end=" ")

find_tribonacci_sequence(number)