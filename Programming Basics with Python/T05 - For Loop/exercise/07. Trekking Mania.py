number_of_groups = int(input())

group1 = 0
group2 = 0
group3 = 0
group4 = 0
group5 = 0

for group in range(number_of_groups):
    climbers_in_group = int(input())
    if climbers_in_group <= 5:
        group1 += climbers_in_group
    if 6 <= climbers_in_group <= 12:
        group2 += climbers_in_group
    if 13 <= climbers_in_group <= 25:
        group3 += climbers_in_group
    if 26 <= climbers_in_group <= 40:
        group4 += climbers_in_group
    if climbers_in_group >= 41:
        group5 += climbers_in_group

total_people_count = group1 + group2 + group3 + group4 + group5

print(f"{(group1 / total_people_count) * 100:.2f}%")
print(f"{(group2 / total_people_count) * 100:.2f}%")
print(f"{(group3 / total_people_count) * 100:.2f}%")
print(f"{(group4 / total_people_count) * 100:.2f}%")
print(f"{(group5 / total_people_count) * 100:.2f}%")