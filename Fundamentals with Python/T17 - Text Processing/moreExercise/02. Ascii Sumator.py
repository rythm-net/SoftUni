start_char = ord(input())
end_char = ord(input())
text = input()

sum = 0

for char in text:
    if start_char < ord(char) < end_char:
        sum += ord(char)

print(sum)