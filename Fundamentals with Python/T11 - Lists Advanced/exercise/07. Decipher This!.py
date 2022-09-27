secret_message = input()
secret_message = secret_message.split(" ")
final_string = ""

for word in secret_message:
    number = ""
    work_string = ""
    for char in word:
        if char.isnumeric():
            number += char
        else:
            work_string += char

    number = int(number)
    if len(work_string) > 1:
        last_letter = work_string[-1]
        first_letter = work_string[0]
        work_string = work_string[1:-1]
        work_string = chr(number) + last_letter + work_string + first_letter
        final_string += work_string + " "
    else:
        work_string = chr(number) + work_string
        final_string += work_string + " "

print(final_string)