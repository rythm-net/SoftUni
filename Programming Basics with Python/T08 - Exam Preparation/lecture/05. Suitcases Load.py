capacity = float(input())
volume = input()
cases_used_volume = 0
left_space = capacity
cases = 0

while volume != "End":
    cases += 1
    volume = float(volume)

    if cases % 3 == 0:
        volume = volume + (volume * 0.1)
    cases_used_volume += volume
    left_space -= volume

    if capacity < cases_used_volume:
        print("No more space!")
        print(f"Statistic: {cases - 1} suitcases loaded.")
        exit()
    volume = input()

if capacity >= cases_used_volume:
    print("Congratulations! All suitcases are loaded!")
    print(f"Statistic: {cases} suitcases loaded.")