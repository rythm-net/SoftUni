import re

text = input().lower()
word = input().lower()

pattern = fr'\b{word}\b'
matches = re.findall(pattern, text)

print(len(matches))