number = int(input())
counter = 1
all_is_print = False

for row in range(1, number + 1):
    for col in range(1, row + 1):
        print(counter, end=" ")
        counter += 1
        if counter > number:
            all_is_print = True
            break
    if all_is_print:
        break

    print()