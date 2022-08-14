failed_threshold = int(input())
bad_grades_counter = 0
name_of_last_problem = ""
problems_counter = 0
grades_sum = 0

while True:
    name_of_problem = input()
    if name_of_problem == "Enough":
        break
    grade = int(input())

    if grade <= 4:
        bad_grades_counter += 1

        if bad_grades_counter >= failed_threshold:
            break

    name_of_last_problem = name_of_problem
    problems_counter += 1
    grades_sum += grade

if bad_grades_counter < failed_threshold:
    average_score = grades_sum / problems_counter
    print(f"Average score: {average_score:.2f}")
    print(f"Number of problems: {problems_counter}")
    print(f"Last problem: {name_of_last_problem}")
else:
    print(f"You need a break, {failed_threshold} poor grades.")