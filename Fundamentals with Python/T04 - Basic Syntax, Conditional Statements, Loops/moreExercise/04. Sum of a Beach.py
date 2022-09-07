string = input().lower()
count = 0

count += string.count("sand")
count += string.count("water")
count += string.count("fish")
count += string.count("sun")

print(count)