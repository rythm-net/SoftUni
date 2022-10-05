courses = {}

while True:
    command = input().split(" : ")
    if command[0] == "end":
        break
    else:
        student_name = command[1]
        course_name = command[0]

    if course_name not in courses:
        courses[course_name] = []
    courses[course_name].append(student_name)

for key, value in courses.items():
    course_name = key
    students = value
    number_of_students = len(students)

    print(f'{course_name}: {number_of_students}')
    for student in students:
        print(f'-- {student}')