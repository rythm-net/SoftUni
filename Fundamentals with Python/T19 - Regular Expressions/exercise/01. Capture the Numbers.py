import re

pattern = r"(\d+)"
content = ""

while True:
    line = input()
    if line:
        content += line
    else:
        break

matches = re.findall(pattern, content)

print(" ".join(matches))