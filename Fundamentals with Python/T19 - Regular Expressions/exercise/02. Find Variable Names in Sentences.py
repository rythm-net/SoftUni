import re

text = input()
pattern = r"\b_{1}([a-zA-Z0-9]+)\b"
matches = re.findall(pattern, text)

print(",".join(matches))