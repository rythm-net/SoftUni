people = int(input())
command = input()
sum_grade = 0
counter = 0

while command != "Finish":
    name = command
    temporarily_sum_grade = 0
    counter += 1

    for i in range (0, people):
        temporarily_grade = float(input())
        temporarily_sum_grade += temporarily_grade

    tempAvgGrade = temporarily_sum_grade / people
    sum_grade += tempAvgGrade
    print(f"{name} - {tempAvgGrade:.2f}.")
    command = input()

average_grade = sum_grade / counter
print(f"Student's final assessment is {average_grade:.2f}.")