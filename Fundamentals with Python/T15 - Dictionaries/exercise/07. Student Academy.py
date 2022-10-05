number_of_pair_of_rows = int(input())
grades = {}

for student in range(number_of_pair_of_rows):
    name = input()
    grade = float(input())
    if name not in grades:
        grades[name] = []
    grades[name].append(grade)

new_grades = {}

for key, value in grades.items():
    if sum(value) / len(value) < 4.5:
        continue
    else:
        new_grades[key] = value

for key, value in new_grades.items():
    average = sum(value) / len(value)
    print(f'{key} -> {average:.2f}')