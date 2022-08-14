student = input()

total_notes = 0
grade = 0
bad_notes = 0

while True:
    notes = float(input())

    if notes >= 4:
        total_notes += notes
        grade += 1
        if grade == 12:
            average = total_notes / 12
            print(f'{student} graduated. Average grade: {average:.2f} ')
            break

    elif notes < 4:
        bad_notes += 1
        if bad_notes == 2:
            print(f'{student} has been excluded at {grade + 1} grade ')
            break