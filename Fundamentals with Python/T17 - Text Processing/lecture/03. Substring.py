string1 = input()
string2 = input()

final_string = string2

while string1 in final_string:
    final_string = final_string.replace(string1, "", 1)

print(final_string)