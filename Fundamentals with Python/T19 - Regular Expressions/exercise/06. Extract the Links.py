import re

pattern = r'\bwww\.[a-zA-Z0-9\-\.]+\.[a-z]{2,8}\b'
contents = ""

while True:
    text = input()
    if text:
        matches = re.findall(pattern, text)
        if len(matches) > 0:
            print(matches[0])
    else:
        break