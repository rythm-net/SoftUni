string1 = input()
string2 = input()

string1 = string1.split(", ")
string2 = string2.split(", ")

substrings = []

for substring in string1:
    for word in string2:
        result = word.find(substring)
        if result >= 0 and substring not in substrings:
            substrings.append(substring)

print(substrings)