import sys
command = input()
min_num = sys.maxsize

while command != "Stop":
    num = int(command)
    if num < min_num:
        min_num = num

    command = input()

print(min_num)