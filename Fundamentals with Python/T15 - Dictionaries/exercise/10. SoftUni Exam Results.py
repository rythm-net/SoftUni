exam = {
    "submissions": {},
    "students": {}
}

while True:
    command = input()
    if command == "exam finished":
        break
    else:
        command = command.split("-")
        name = command[0]
        if command[1] == "banned":
            exam["students"][name]["banned"] = True
        else:
            name = command[0]
            language = command[1]
            points = int(command[2])

            # count submissions
            if language in exam['submissions']:
                exam["submissions"][language] += 1
            else:
                exam["submissions"][language] = 1
            # enter points
            if name in exam["students"]:
                if language in exam["students"][name]:
                    if exam["students"][name][language] < points:
                        exam["students"][name][language] = points
                else:
                    exam["students"][name][language] = points
            else:
                exam["students"][name] = {"banned": False, language: points}

print("Results:")

for key, value in exam["students"].items():
    name = key
    for key1, value1 in value.items_to_steal():
        if value1 == True:
            break
        elif key1 == "banned":
            pass
        elif value1:
            print(f'{name} | {value1}')
            
print("Submissions:")
for key, value in exam["submissions"].items():
    print(f'{key} - {value}')