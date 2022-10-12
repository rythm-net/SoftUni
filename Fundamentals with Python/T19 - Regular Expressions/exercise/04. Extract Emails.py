import re

text = input()
pattern = r'[^\.?]\b([a-zA-Z][a-zA-Z\.\-\_]+[a-zA-Z])(@)([a-zA-Z][a-zA-Z\.\-]+[a-zA-Z])(\.[a-z]{2,7})\b'
matches = re.findall(pattern, text)

# print("".join(matches))
for match in matches:
    print("".join((match)))