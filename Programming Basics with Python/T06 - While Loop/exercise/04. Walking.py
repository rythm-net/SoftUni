total_steps = 0
target_steps = 10000
command = input()

while target_steps > total_steps:
    if command == "Going home":
        command = input()
        steps = int(command)
        total_steps += steps
        if total_steps >= target_steps:
            print("Goal reached! Good job!")
            print(f"{abs(target_steps - total_steps)} steps over the goal!")

        else:
            print(f"{abs(target_steps - total_steps)} more steps to reach goal.")
            break

    else:
        steps = int(command)
        total_steps += steps
        if total_steps >= target_steps:
            print("Goal reached! Good job!")
            print(f"{abs(total_steps - target_steps)} steps over the goal!")
            break
        command = input()