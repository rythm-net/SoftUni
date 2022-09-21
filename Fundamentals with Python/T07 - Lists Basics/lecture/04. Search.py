n = int(input())
search_word = input()
new_list = []

for i in range(n):
    new_entry = input()
    new_list.append(new_entry)

filtered_list = [word for word in new_list if search_word in word]

print(new_list)
print(filtered_list)