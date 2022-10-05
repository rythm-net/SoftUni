resources = {}

while True:
    command = input()
    if command == "stop":
        for key, value in resources.items():
            print(f'{key} -> {value}')
        break
    else:
        resource = command
        quantity = int(input())
        if resource not in resources:
            resources[resource] = 0
            resources[resource] += quantity