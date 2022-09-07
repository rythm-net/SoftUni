string_animals = input()
list_animals = string_animals.split(", ")

for number in range(len(list_animals), 0, -1):
    if list_animals[-1] == "wolf":
        print("Please go away and stop eating my sheep")
        break
    elif list_animals[-number] == "wolf":
        print(f"Oi! Sheep number {number - 1}! You are about to be eaten by a wolf!")