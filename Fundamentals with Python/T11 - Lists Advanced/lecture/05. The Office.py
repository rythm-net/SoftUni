employees_happiness = input()
factor = int(input())

employees_happiness = employees_happiness.split(" ")
employees_happiness = [int(employee) for employee in employees_happiness]

refactor_happiness = [employee * factor for employee in employees_happiness]

average_happiness = sum(refactor_happiness) / len(refactor_happiness)
happy_count = [employee for employee in refactor_happiness if employee >= average_happiness]

if len(happy_count) >= len(refactor_happiness) / 2:
    print(f'Score: {len(happy_count)}/{len(refactor_happiness)}. Employees are happy!')
else:
    print(f'Score: {len(happy_count)}/{len(refactor_happiness)}. Employees are not happy!')