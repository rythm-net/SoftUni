commands = int(input())
registered_cars = {}

for i in range(commands):
    request = input().split(" ")
    action = request[0]
    username = request[1]

    if action == "register":
        license_plate = request[2]
        if username in registered_cars:
            print(f"ERROR: already registered with plate number {registered_cars[username]}")
        else:
            registered_cars[username] = license_plate
            print(f'{username} registered {license_plate} successfully')

    elif action == "unregister":
        if username in registered_cars:
            del registered_cars[username]
            print(f'{username} unregistered successfully')
        else:
            print(f'ERROR: user {username} not found')

for key, value in registered_cars.items():
    print(f'{key} => {value}')