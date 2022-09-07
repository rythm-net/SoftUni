string = input()
index_list = []

for index, letter in enumerate(string):
    if letter.isupper():
        index_list.append(index)

print(index_list)