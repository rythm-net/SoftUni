companies = {}

while True:
    command = input().split(" -> ")
    if command[0] == "End":
        break
    else:
       company = command[0]
       id = command[1]

    if company not in companies:
        companies[company] = []
    if id in companies[company]:
        continue
    else:
        companies[company].append(id)

for key, value in companies.items():
    company = key
    employees = value

    print(company)
    for employee in employees:
        # print(key, value)
        print(f'-- {employee}')
