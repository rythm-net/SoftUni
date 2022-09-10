people = int(input())
capacity = int(input())

if people <= capacity:
    courses = 1
else:
    if people % capacity == 0:
        courses = int(people / capacity)
    else:
        courses = people // capacity + 1

print(courses)