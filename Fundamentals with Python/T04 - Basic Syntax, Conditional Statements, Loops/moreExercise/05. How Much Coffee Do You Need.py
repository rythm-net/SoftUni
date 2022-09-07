command = input()
total_coffee_count = 0

while command != "END":
    coffee_count = 0
    if command.casefold() == "coding" or \
            command.casefold() == "dog" or \
            command.casefold() == "cat" or \
            command.casefold() == "movie":
        if command.islower():
            coffee_count = 1
        elif command.isupper():
            coffee_count = 2
        total_coffee_count += coffee_count

    command = input()

if total_coffee_count > 5:
    print("You need extra sleep")
else:
    print(total_coffee_count)