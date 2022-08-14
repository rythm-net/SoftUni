import sys
command = input()
max_num = -sys.maxsize

while command != "Stop":
    num = int(command)
    if num > max_num:
        max_num = num

    command = input()

print(max_num)