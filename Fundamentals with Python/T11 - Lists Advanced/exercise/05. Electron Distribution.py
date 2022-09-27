number_of_electrons = int(input())

filling_electrons = number_of_electrons
shells = []

n = 1

while sum(shells) < number_of_electrons and filling_electrons > 0:
    max_electrons = 2 * (n ** 2)

    if max_electrons <= filling_electrons:
        electrons = max_electrons
        shells.append(electrons)
        n += 1
        filling_electrons -= electrons
    else:
        electrons = filling_electrons
        filling_electrons -= electrons
        shells.append(electrons)

print(shells)