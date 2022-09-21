input_string = input()

new_list = input_string.split(" ")
int_list = [int(number) for number in new_list]
final_list = [number * - 1 for number in int_list]

print(final_list)