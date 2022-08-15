start_number = int(input())
end_number = int(input())
magic_number = int(input())
combination_number = 0
flag = False

for n1 in range(start_number, end_number + 1):
    for n2 in range(start_number, end_number + 1):
        combination_number += 1
        if n1 + n2 == magic_number:
            flag = True
            print(f"Combination N:{combination_number} ({n1} + {n2} = {magic_number})")
            break

    if flag:
        break

if n1 + n2 != magic_number:
    print(f"{combination_number} combinations - neither equals {magic_number}")