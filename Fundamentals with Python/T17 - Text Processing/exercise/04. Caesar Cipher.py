text = input()

new_text = ""
for char in text:
    new_char = ord(char) + 3
    new_text += chr(new_char)

print(new_text)