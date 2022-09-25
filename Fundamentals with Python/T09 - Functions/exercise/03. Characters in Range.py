start_character = input()
end_character = input()

def characters_in_range(start, end):
    string = ""
    for char in range(ord(start) + 1, ord(end)):
        string += f"{chr(char)} "
    return string

print(characters_in_range(start_character, end_character))