import re

dates = input()
regex = "\\b([0-9]{2})([-.\\/])([A-Z][a-z]{2})\\2([0-9]{4})\\b"
matches = re.findall(regex, dates)

for date in matches:
    print(f'Day: {date[0]}, Month: {date[2]}, Year: {date[3]}')