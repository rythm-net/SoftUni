number_of_lines = int(input())
start_search = False
container = []

for i in range(number_of_lines):
    x = input()

    if x == "(" and start_search == True:
        container.append("UNBALANCED")
    elif x == "(" and start_search == False:
        start_search = True
    if x == ")" and start_search == True:
        container.append("BALANCED")
        start_search = False
    elif x == ")" and start_search == False:
        container.append("UNBALANCED")

if "UNBALANCED" in container:
    print("UNBALANCED")
else:
    print("BALANCED")