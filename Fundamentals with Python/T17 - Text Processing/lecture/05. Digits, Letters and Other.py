text = input()

numbers = ""
letters = ""
symbols = ""

for letter in text:
    if letter.isnumeric():
        numbers += letter
    elif letter.isalpha():
        letters += letter
    else:
        symbols += letter

print(numbers)
print(letters)
print(symbols)