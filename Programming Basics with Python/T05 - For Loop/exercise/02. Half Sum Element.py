import sys

number_of_range = int(input())
sum_numbers = 0
max_number = -sys.maxsize

for _ in range(number_of_range):
    current_number = int(input())
    sum_numbers += current_number

    if current_number > max_number:
        max_number = current_number

sum_numbers -= max_number

if sum_numbers == max_number:
    print("Yes")
    print(f"Sum = {max_number}")

else:
    print("No")
    print(f"Diff = {abs(max_number - sum_numbers)}")