version = input()
version = version.split(".")
version = [int(number) for number in version]
version[2] += 1

if version[2] > 9:
    version[2] = 0
    version[1] += 1
    if version[1] > 9:
        version[1] = 0
        version[0] += 1

version = [str(number) for number in version]
new_version = ".".join(version)

print(new_version)