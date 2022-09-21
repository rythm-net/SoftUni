string = input()
water = int(input())

cells = string.split("#")
effort = 0
print("Cells:")

for cell in cells:
    entry = cell.split(" = ")
    type_of_fire = entry[0]
    water_needed = int(entry[1])

    if type_of_fire == "Low" and 1 <= water_needed <= 50 and water - water_needed >= 0:
        water -= water_needed
        effort += water_needed * .25
        print(f' - {water_needed}')

    elif type_of_fire == "Medium" and 51 <= water_needed <= 80 and water - water_needed >= 0:
        water -= water_needed
        effort += water_needed * .25
        print(f' - {water_needed}')

    elif type_of_fire == "High" and 81 <= water_needed <= 125 and water - water_needed >= 0:
        water -= water_needed
        effort += water_needed * .25
        print(f' - {water_needed}')

print(f'Effort: {effort:.2f}')
total_fire = int(effort * 4)
print(f'Total Fire: {total_fire}')