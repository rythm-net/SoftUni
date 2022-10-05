users = {}

while True:
    command = input()

    if command.startswith("Lumpawaroo"):
        break
    else:
        if " | " in command:
            command = command.split(" | ")
            force_side = command[0]
            force_user = command[1]
            user_exist = False

            for key, value in users.items():
                if force_user in value:
                    user_exist = True

            if user_exist:
                continue
            elif force_side not in users:
                users[force_side] = []
                if force_user not in users[force_side]:
                    users[force_side].append(force_user)

        elif " -> " in command:
            command = command.split(" -> ")
            force_user = command[0]
            force_side = command[1]
            user_exist = False

            for key, value in users.items():
                if force_user in value:
                    user_exist = True
                    value.remove(force_user)

            if force_side not in users and not user_exist:
                users[force_side] = []

            if not user_exist:
                users[force_side].append(force_user)
                print(f'{force_user} joins the {force_side} side!')
            if user_exist:
                users[force_side].append(force_user)
                print(f'{force_user} joins the {force_side} side!')

for key, value in users.items():
    if len(value) > 0:
        print(f'Side: {key}, Members: {len(value)}')
        for member in value:
            print(f'! {member}')